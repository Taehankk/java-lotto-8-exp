package com.lotto.gamble.store;

import org.springframework.stereotype.Component;

import com.lotto.gamble.entity.Lotto;

@Component
public class WinningLottoStore {
	private Lotto winningLotto;
	private int bonusNum;
	
	WinningLottoStore(Lotto winningLotto, int bonusNum) {
		this.winningLotto = winningLotto;
		this.bonusNum = bonusNum;
	}
	
	public Lotto getWinningLotto() {
		return winningLotto.copy_Lotto();
	}
	
	public int getBonusNum() {
		return bonusNum;
	}
}
