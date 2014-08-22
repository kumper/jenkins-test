package com.kp;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(suiteName = "MAIN")
public class CalculatorTest {
	
	@Test(testName = "test1")
	public void AddTest() {
		final Calculator calc = new Calculator();
		
		Assert.assertTrue(calc.add(1, 2) == 3);
	}
	
	@Test(testName = "substractTetst")
	public void SubstractTest() {
		final Calculator calc = new Calculator();
		
		Assert.assertTrue(calc.substract(5, 2) == 3);
	}
	
	@Test
	public void RigorousTest() {
		Assert.assertTrue(true);
	}

}
