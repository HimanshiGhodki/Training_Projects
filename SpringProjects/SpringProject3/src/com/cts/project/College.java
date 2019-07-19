package com.cts.project;

public class College {
	private int Regno;
	private String cname;
	private String add;
	private long cphone_no;
	private Teacher teach;
	private Student stud;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int regno, String cname, String add, long cphone_no, Teacher teach, Student stud) {
		super();
		Regno = regno;
		this.cname = cname;
		this.add = add;
		this.cphone_no = cphone_no;
		this.teach = teach;
		this.stud = stud;
	}
	public int getRegno() {
		return Regno;
	}
	public void setRegno(int regno) {
		Regno = regno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public long getCphone_no() {
		return cphone_no;
	}
	public void setCphone_no(long cphone_no) {
		this.cphone_no = cphone_no;
	}
	public Teacher getTeach() {
		return teach;
	}
	public void setTeach(Teacher teach) {
		this.teach = teach;
	}
	public Student getStud() {
		return stud;
	}
	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	
	

}
