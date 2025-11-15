package com.lotto.gamble.service;

import org.springframework.stereotype.Service;

import com.lotto.gamble.entity.Lotto;

@Service
public class LottoCalService {
	private final LottoPickService lps;
	
	LottoCalService(LottoPickService lps) {
		this.lps = lps;
	}
}
