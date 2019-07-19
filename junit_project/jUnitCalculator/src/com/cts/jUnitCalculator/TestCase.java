package com.cts.jUnitCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {

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
	void testAdd() {
		//fail("Not yet implemented");
		Calculator c = new Calculator();
		assertEquals(30,c.add(20,10));
	}

	@Test
	void testSub() {
		//fail("Not yet implemented");
		Calculator c=new Calculator();
		assertEquals(10,c.sub(20,10));
	}

}
