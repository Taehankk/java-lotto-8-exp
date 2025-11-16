package com.lotto.gamble.store;

import org.springframework.stereotype.Component;

import com.lotto.gamble.dto.Lotto;

import java.util.*;

@Component
public class WinningLottoStore {
	private Lotto winningLotto;
	private int bonusNum;
	
	public void publish(Lotto winningLotto, int bonusNum) {
		this.winningLotto = winningLotto;
		this.bonusNum = bonusNum;
	}
	
	public List<Integer> getWinningNumbers() {
		if(winningLotto == null) return null;
		
		return winningLotto.getNumbers();
	}
	
	public int getBonusNum() {
		return bonusNum;
	}
}
