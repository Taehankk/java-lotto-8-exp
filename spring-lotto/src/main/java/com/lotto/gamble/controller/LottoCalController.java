package com.lotto.gamble.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lotto.gamble.entity.Lotto;
import com.lotto.gamble.service.LottoCalService;
import com.lotto.gamble.service.LottoPickService;

@RestController
@RequestMapping("/api/lotto/cal")
public class LottoCalController {
	private final Lotto winningLotto;
	private final int bonusNum;
	
	private final LottoCalService lcs;
	private final LottoPickService lps;
	
	LottoCalController(LottoCalService lcs, LottoPickService lps) {
		this.lcs = lcs;
		this.lps = lps;
		
		winningLotto = lps.pickOneLotto();
		bonusNum = lps.pickBonusNum();
	}
}
