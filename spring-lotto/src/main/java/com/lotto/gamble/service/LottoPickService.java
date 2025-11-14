package com.lotto.gamble.service;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Randoms;

import com.lotto.gamble.entity.Lotto;

@Service
public class LottoPickService {
	public List<List<Integer>> drawingLotto(int lottoCnt) {
		List<List<Integer>> lottos = new ArrayList<>();
		
		for(int i = 0; i < lottoCnt; i++) {
			lottos.add(pickOneLotto());
		}
		
		return lottos;
	}
	
	private List<Integer> pickOneLotto() {
		List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
		
		Lotto lotto = new Lotto(numbers);
		
		return lotto.toNumberList();
	}
}
