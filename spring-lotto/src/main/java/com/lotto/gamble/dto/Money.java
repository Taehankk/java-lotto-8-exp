package com.lotto.gamble.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Money {
	private final int money;
	
	@JsonCreator
	Money(@JsonProperty("money") int money) {
		if(money <= 0) {
			
		}
		
		if(money % 1000 != 0) {
			
		}
		
		this.money = money;
	}
	
	public int calLottoCnt() {
		return money / 1000;
	}
	
	public int getMoney() {
		return money;
	}
}
