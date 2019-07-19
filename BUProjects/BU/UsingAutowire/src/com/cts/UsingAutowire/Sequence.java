package com.cts.UsingAutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Sequence 
{
	@Autowired
	private PrefixGenerator prefixgenerator;
	@Value("SVM")
	private String suffix;
	@Value("101")
	private int initial;
	public int counter;
	public Sequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sequence(String suffix, int initial) {
		super();
		this.suffix = suffix;
		this.initial = initial;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public int getInitial() {
		return initial;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public String getSequence()
	{
		StringBuilder sb=new StringBuilder();
		sb.append(prefixgenerator.getPrefix());
		sb.append(initial+ counter++);
		sb.append(suffix);
		return sb.toString();
	}

}
