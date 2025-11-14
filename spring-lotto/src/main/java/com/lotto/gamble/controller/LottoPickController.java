package com.lotto.gamble.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.lotto.gamble.entity.Money;
import com.lotto.gamble.service.LottoPickService;

@RestController
@RequestMapping("/api/lotto/pick")
public class LottoPickController {
	private final LottoPickService lps;
	
	LottoPickController(LottoPickService lps) {
		this.lps = lps;
	}
	
	@PostMapping("/purchase")
	public ResponseEntity<List<List<Integer>>> purchaseLotto(@RequestBody Money money) {		
		List<List<Integer>> lottos = lps.drawingLotto(money.calLottoCnt());
		
		return ResponseEntity.ok(lottos);
	}
}
