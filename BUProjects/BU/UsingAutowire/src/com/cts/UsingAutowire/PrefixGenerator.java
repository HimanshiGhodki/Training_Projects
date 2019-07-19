package com.cts.UsingAutowire;

import org.springframework.beans.factory.annotation.Value;

//javax.Persistance.*

public class PrefixGenerator 
{
	@Value("TX")
	private String prefix;

	public PrefixGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrefixGenerator(String prefix) {
		super();
		this.prefix = prefix;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	

}
