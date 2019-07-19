package com.cts.DaoSequenceWithoutBean;

public class Sequence {
	private String prefix;
	private int initial;
	private String suffix;
	public int counter;
	public Sequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sequence(String prefix,int initial ,String suffix) {
		super();
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}
	
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
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
		sb.append(prefix);
		sb.append(initial+ counter++);
		sb.append(suffix);
		return sb.toString();
	}
}
