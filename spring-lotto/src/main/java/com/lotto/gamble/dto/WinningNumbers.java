package com.lotto.gamble.dto;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;

public class WinningNumbers {
	private final List<Integer> numbers;
	private final int bonusNum;
	
	@JsonCreator
	public WinningNumbers(List<Integer> numbers, int bonusNum) {
		this.numbers = numbers;
		this.bonusNum = bonusNum;
	}
	
	public List<Integer> getNumbers() {
		return numbers;
	}
	
	public int getBonusNum() {
		return bonusNum;
	}
}
