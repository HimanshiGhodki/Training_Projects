package com.cts.Collections;

public class Teacher {
	private String tname;
	private String tadd;
	private long tphone_no;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String tname, String tadd, long tphone_no) {
		super();
		this.tname = tname;
		this.tadd = tadd;
		this.tphone_no = tphone_no;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTadd() {
		return tadd;
	}
	public void setTadd(String tadd) {
		this.tadd = tadd;
	}
	public long getTphone_no() {
		return tphone_no;
	}
	public void setTphone_no(long tphone_no) {
		this.tphone_no = tphone_no;
	}
}
