package com.cts.sequenceNumber;

import org.springframework.beans.factory.annotation.Value;

public class Sequence {
	@Value("HR")
	private String prefix;
	@Value("WC")
	private String sufix;
	private int value;
	public Sequence(String prefix, String sufix, int value) {
		super();
		this.prefix = prefix;
		this.sufix = sufix;
		this.value = value;
	}
	public Sequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSufix() {
		return sufix;
	}
	public void setSufix(String sufix) {
		this.sufix = sufix;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}


}
