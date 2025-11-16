package com.lotto.gamble.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lotto.gamble.lotto.Winner;
import com.lotto.gamble.service.LottoCalService;

@RestController
@RequestMapping("/api/lotto/cal")
public class LottoCalController {	
	private final LottoCalService lcs;
	
	LottoCalController(LottoCalService lcs) {
		this.lcs = lcs;
	}
	
	@PostMapping("/winning")
	public ResponseEntity<List<Winner>> calLottoResult(@RequestBody List<List<Integer>> lottos) {
		List<Winner> result = lcs.calTotalResult(lottos);
		
		if(result == null) {
			System.out.println("에러 발생");
			return ResponseEntity.badRequest().build();
		}
		
		return ResponseEntity.ok(result);
	}
}
