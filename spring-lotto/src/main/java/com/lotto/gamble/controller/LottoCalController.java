package com.lotto.gamble.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lotto.gamble.service.LottoCalService;
import com.lotto.gamble.store.WinningLottoStore;

@RestController
@RequestMapping("/api/lotto/cal")
public class LottoCalController {	
	private final LottoCalService lcs;
	
	LottoCalController(LottoCalService lcs) {
		this.lcs = lcs;
	}
}
