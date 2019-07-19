package com.cts.arithmatic.test;

public class Arithmatic 
{
	public boolean isPositive(int n) 
	{
		if(n>=0)
			return true;
		else
			return false;
	}
	
	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public int getMax(int a, int b)
	{
		if(a>b)
			return a;
		else 
			return b;
	}

}
