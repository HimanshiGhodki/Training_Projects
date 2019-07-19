package com.cts.DaoSequenceWithoutBean;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class SequenceDAOImpl implements SequenceDAO
{
	JdbcTemplate jdt;

	public SequenceDAOImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SequenceDAOImpl(JdbcTemplate jdt) {
		super();
		this.jdt = jdt;
	}

	public JdbcTemplate getJdt() {
		return jdt;
	}

	public void setJdt(JdbcTemplate jdt) {
		this.jdt = jdt;
	}

	@Override
	public void insertSequence() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter prefix");
		String prefix=sc.nextLine();
		System.out.println("Enter initial in integer value");
		int initial=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter suffix");
		String suffix=sc.nextLine();
		Sequence s=new Sequence(prefix, initial, suffix);
		Object [] arr = {s.getPrefix() , s.getInitial() , s.getSuffix()};
		//int n = jdt.update("insert into sequence values (?,?,?)", arr);
		jdt.update("insert into sequence values (?,?,?)", arr);
		for(int i=0;i<10;i++) 
		{
			System.out.println(s.getSequence());
		}
		sc.close();
	}

	@Override
	public void display(String prefix) 
	{
		Object []param= {prefix};
		Sequence seq = jdt.queryForObject("select * from sequence where prefix = ?", param, new SequenceRowMapper());
		//seq.getSequence();
		for(int i=0;i<10;i++) 
		{
			System.out.println(seq.getSequence());
		}
		
	}

}
