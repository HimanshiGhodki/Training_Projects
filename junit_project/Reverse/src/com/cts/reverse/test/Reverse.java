package com.cts.reverse.test;

public class Reverse 
{
	private String s;
	

	public Reverse(String s) {
		super();
		this.s = s;
	}

	public String reverse()
	{
		StringBuilder sb=new StringBuilder(s);
		return sb.reverse().toString();
	}

}

