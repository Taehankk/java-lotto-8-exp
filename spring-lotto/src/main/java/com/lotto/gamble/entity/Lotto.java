package com.lotto.gamble.entity;

import java.util.*;
import java.util.stream.Collectors;

public class Lotto {
	private final List<Integer> numbers;
	
    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
        
        for(int i = 0; i < 6; i++) {
        	if(numbers.get(i) < 1 || numbers.get(i) > 45) {
        		throw new IllegalArgumentException("[ERROR] 로또 번호는 1 이상 45 이하의 자연수입니다.");
        	}
        }
        
        validateDuplication(numbers);
    }
    
    public void validateDuplication(List<Integer> numbers) {
    	Set<Integer> numberSet = new HashSet<>();
    	
    	for(int num : numbers) {
    		numberSet.add(num);
    	}
    	
    	if(numberSet.size() != 6) {
    		throw new IllegalArgumentException("[ERROR] 중복된 값을 입력하셨습니다.");
    	}
    }
    
    public boolean hasNumber(int num) {    	
    	return numbers.contains(num);
    }
    
    public Lotto copy_Lotto() {
    	if(this.numbers == null) return null;
    	
    	return new Lotto(toNumberList());
    }
    
    public List<Integer> toNumberList() {
    	List<Integer> copy_numbers = new ArrayList<>();
    	
    	for(int num : numbers) {
    		copy_numbers.add(num);
    	}
    	
    	return copy_numbers;
    }

    public List<Integer> getNumbers() {
    	return toNumberList();
    }
    
    @Override
    public String toString() {
    	return numbers.toString();
    }
}
