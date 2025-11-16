package com.lotto.gamble.service;

import org.springframework.stereotype.Service;
import java.util.*;

import camp.nextstep.edu.missionutils.Randoms;

import com.lotto.gamble.dto.WinningNumbers;
import com.lotto.gamble.lotto.Lotto;
import com.lotto.gamble.store.WinningLottoStore;

@Service
public class LottoPickService {
	private final WinningLottoStore wls;
	
	LottoPickService(WinningLottoStore wls) {
		this.wls = wls;
	}
	
	public List<List<Integer>> drawingLotto(int lottoCnt) {
		List<List<Integer>> lottos = new ArrayList<>();
		
		for(int i = 0; i < lottoCnt; i++) {
			lottos.add(pickOneLotto().toNumberList());
		}
		
		return lottos;
	}
	
	public Lotto pickOneLotto() {
		List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
		
		Lotto lotto = new Lotto(numbers);
		
		return lotto;
	}
	
	public int pickBonusNum() {
		return Randoms.pickNumberInRange(1, 45);
	}
	
	public WinningNumbers getWinningData() {
		if(wls.getWinningNumbers() == null) {
			wls.publish(pickOneLotto(), pickBonusNum());			
		}
		
		return new WinningNumbers(wls.getWinningNumbers(), wls.getBonusNum());
	}
}
