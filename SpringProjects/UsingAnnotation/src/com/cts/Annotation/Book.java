package com.cts.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Book {
	@Value("123")
	private int bcode;
	@Value("meluha")
	private String bname;
	@Value("500")
	private double price;
	private Publisher pub;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bcode, String bname, double price, Publisher pub) {
		super();
		this.bcode = bcode;
		this.bname = bname;
		this.price = price;
		this.pub = pub;
	}


	public int getBcode() {
		return bcode;
	}


	public void setBcode(int bcode) {
		this.bcode = bcode;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	@PostConstruct
	public void init() {
		System.out.println("Initializing");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
	}


	public Publisher getPub() {
		return pub;
	}

	@Autowired
	public void setPub(Publisher pub) {
		this.pub = pub;
	}
	

}
