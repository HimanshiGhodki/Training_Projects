package com.cts.Collections;

public class Student {
	private String sname;
	private String sadd;
	private long sphone_no;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sname, String sadd, long sphone_no) {
		super();
		this.sname = sname;
		this.sadd = sadd;
		this.sphone_no = sphone_no;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public long getSphone_no() {
		return sphone_no;
	}
	public void setSphone_no(long sphone_no) {
		this.sphone_no = sphone_no;
	}
	
}
