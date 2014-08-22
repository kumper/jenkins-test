package com.kp.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.kp.Calculator;

@Test(suiteName = "MAIN")
public class TestNew {
	
	private Calculator calc;
	
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
	}
	
	@Test(testName = "a")
	public void AddTestNew() {
		Assert.assertTrue(calc.add(5, 4) == 9);
	}
	
	@Test(testName = "asdf")
	public void SubstractTest() {
		Assert.assertTrue(calc.substract(6, 2) == 4);
	}

	@Test(testName = "test3")
	public void AddSubtractTestNew() {
		Assert.assertTrue(calc.add(2, calc.substract(5, 3)) == 4);
		
		assert (calc.add(2, calc.substract(5, 3)) == 4);
	}

}
