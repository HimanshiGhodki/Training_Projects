package com.cts.arithmatic.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestArithmatic {

	@BeforeEach
	void setUp() throws Exception 
	{
		System.out.println("About to begin test");
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		System.out.println("test over");
	}

	@Test
	final void testIsPositive() 
	{
		//fail("Not yet implemented");
		Arithmatic ar=new Arithmatic();
		assertTrue(ar.isPositive(8));
		assertFalse(ar.isPositive(-6));
	}

	@Test
	final void testMultiply() 
	{
		//fail("Not yet implemented");
		Arithmatic ar=new Arithmatic();
		assertEquals(10, ar.multiply(5, 2));
	}

	@Test
	final void testGetMax() 
	{
		//fail("Not yet implemented");
		Arithmatic ar=new Arithmatic();
		assertEquals(10, ar.getMax(5, 10));
	}

}
