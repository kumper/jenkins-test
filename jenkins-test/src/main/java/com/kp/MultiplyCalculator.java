package com.kp;

import java.rmi.UnexpectedException;

public class MultiplyCalculator extends Calculator {

	/**
	 * COmments.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) throws UnexpectedException {
		if (b == 0) {
			throw new UnexpectedException("Division by zero");
		}
		
		return a / b;
	}

}
