package com.cts.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Publisher {
	@Value("Amish")
	private String pname;
	@Value("mumbai")
	private String padd;
	
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Publisher(String pname, String padd) {
		super();
		this.pname = pname;
		this.padd = padd;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}


}
