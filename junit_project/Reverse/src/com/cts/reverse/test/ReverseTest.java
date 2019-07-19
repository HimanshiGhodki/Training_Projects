package com.cts.reverse.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ReverseTest 
{
	private String s1;
	private String s2;
	
	public ReverseTest(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> getData()
	{
		Object[][] data=new Object[][]
		{
			{"about", "tuoba"},
			{"talk", "klat"},
			{"bad", "dab"}
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void TestString()
	{
		Reverse rs=new Reverse(this.s1);
		String actual=rs.reverse();
		assertEquals(actual, this.s2);
	}

}
