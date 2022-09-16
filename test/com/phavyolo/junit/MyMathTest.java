package com.phavyolo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {
		
		int[] numbers = {1,2,3};
		MyMath myMath = new MyMath();
		int result = myMath.calculateSum(numbers);
		int expectedResult = 6;
		assertEquals(expectedResult, result);
		
	}

}
