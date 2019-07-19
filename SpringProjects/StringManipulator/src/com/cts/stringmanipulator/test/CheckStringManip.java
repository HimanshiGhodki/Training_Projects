package com.cts.stringmanipulator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckStringManip {

	@BeforeEach
	void setUp() throws Exception 
	{
		
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		
	}

	@Test
	final void testStringManip() 
	{
		//fail("Not yet implemented");
		StringManip sm=new StringManip("mitali", "MITALI");
		assertEquals(sm.actual.toUpperCase(), sm.expected);
		
		
	}

}
