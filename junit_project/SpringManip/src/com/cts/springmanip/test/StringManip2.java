package com.cts.springmanip.test;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class StringManip2 
{
	private String actual;
	private String expected;
	public StringManip2(String actual, String expected) {
		super();
		this.actual = actual;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> generateData()
	{
		Object[][]data=new Object[][] 
		{
			{"Smita", "SMITA"},
			{"smita", "SMITA"},
			{"SMITA", "SMITA"}
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void testUpperCase()
	{
		StringManip s=new StringManip(this.actual);
		String actualResult=s.UpperCase();
		assertEquals(actualResult, this.expected);
	}

}
