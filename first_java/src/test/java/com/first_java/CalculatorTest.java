package com.first_java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import day3.Calculator;

public class CalculatorTest {
	//@Before will inform to JVM that it is like a constructor
	
	private Calculator c;
	@Before
	public void setUp() throws Exception {
		c=new Calculator();
	}
	//@After will inform to JVM that it is like a destructor
	@After
	public void tearDown() throws Exception {
		c=null;
	}
	
	//@Test will inform to JVM that it is a test case

	@Test
	public void testAdd() {
		int i=c.add(5,4);
		assert i>8 : "value should be greater than 8";
	}

	@Test
	public void testSub() {
		//fail("Not yet implemented");
	}

	@Test
	public void testMult() {
		//fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		//fail("Not yet implemented");
	}

}
