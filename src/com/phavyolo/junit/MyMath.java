package com.phavyolo.junit;

public class MyMath {
	
	public int calculateSum(int[] numbers) {
		
		int sum = 0;
		
		for(var number:numbers) {
			sum += number;
		}
		
		return sum;
		
	}

}
