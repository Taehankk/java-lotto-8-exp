package com.lotto.gamble.service;

import org.springframework.stereotype.Service;

import com.lotto.gamble.lotto.Winner;
import com.lotto.gamble.store.WinningLottoStore;

import java.util.*;

@Service
public class LottoCalService {
	private final WinningLottoStore wls;
	
	LottoCalService(WinningLottoStore wls) {
		this.wls = wls;
	}
	
	public List<Winner> calTotalResult(List<List<Integer>> lottos) {
		if(wls.getWinningNumbers() == null) {
			return null;
		}
		
		List<Winner> result = new ArrayList<>();
		for(List<Integer> lotto : lottos) {
			result.add(calOneResult(lotto));
		}
		
		return result;
	}
	
	public Winner calOneResult(List<Integer> lotto) {
		int matchedCnt = 0;
		for(int num : lotto) {
			if(wls.matchNumber(num)) matchedCnt++;
		}
		
		return Winner.of(matchedCnt, wls.matchBonusNum(lotto));
	}
}
