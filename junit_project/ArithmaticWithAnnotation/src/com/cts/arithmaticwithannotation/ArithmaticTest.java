package com.cts.arithmaticwithannotation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmaticTest 
{
	int n1;
	int n2;
	int expected;
	
	public ArithmaticTest( int expected, int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.expected = expected;
	}


	@Parameterized.Parameters
	public static Collection<Object[]> getData()
	{
		Object[][] data= new Object[][]
		{
			{0, 0, 0},
			{1, 1, 0},
			{2, 1, 1},
			{3, 2, 1},
			{4, 3, 1},
			{5, 5, 0},
			{6, 8, -2}
		};
		return Arrays.asList(data);
	}
	
	
	@Test
	public void TestSum()
	{
		Arithmatic a=new Arithmatic(this.n1, this.n2);
		
		assertEquals(expected, a.sum() );
	}
	
	
}
