package com.lotto.gamble.lotto;

public enum Winner {
	FIRST(6,2000000000, "6개 일치 (2,000,000,000원) - "),
	SECOND(5, 30000000, "5개 일치, 보너스 볼 일치 (30,000,000원) - "),
	THIRD(5, 1500000, "5개 일치 (1,500,000원) - "),
	FOURTH(4, 50000, "4개 일치 (50,000원) - "),
	FIFTH(3, 5000, "3개 일치 (5,000원) - "),
	MISS(0, 0, "낙첨");
	
	private int correctCnt;
	private int prize;
	private String printContents;
	
	Winner(int correctCnt, int prize, String printContents) {
		this.correctCnt = correctCnt;
		this.prize= prize;
		this.printContents = printContents;
	}
	
	public static Winner of(int matchedCnt, boolean matchedBonusNum) {
		if(matchedCnt == 5 && !matchedBonusNum) {
			return Winner.THIRD;
		}
		
		for(Winner w : values()) {
			if(w.correctCnt == matchedCnt) {
				return w;
			}
		}
		
		return Winner.MISS;
	}
	
	public int getCorrectCnt() {
		return correctCnt;
	}
	
	public int getPrize() {
		return prize;
	}
	
	public String getPrintContents() {
		return printContents;
	}
}
