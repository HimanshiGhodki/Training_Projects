package com.cts.employeemanagementsystem.bean;

public class EmployeeBean {
	private int eid;
	private String fname;
	private String lname;
	private int esalary;
	private String edesignation;
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeBean(int eid, String fname, String lname, int esalary, String edesignation) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.esalary = esalary;
		this.edesignation = edesignation;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", esalary=" + esalary
				+ ", edesignation=" + edesignation + "]";
	}
	

}
