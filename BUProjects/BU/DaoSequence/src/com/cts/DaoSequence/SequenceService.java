package com.cts.DaoSequence;

import java.util.Scanner;

public class SequenceService 
{
	SequenceDAO dao;

	public SequenceService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SequenceService(SequenceDAO dao) {
		super();
		this.dao = dao;
	}
	public void insertRow() 
	{
		Scanner sc=new Scanner(System.in);
		String prefix=sc.nextLine();
		int initial=sc.nextInt();
		sc.nextLine();
		String suffix=sc.nextLine();
		Sequence seq=new Sequence(prefix, initial, suffix);
		dao.insertSequence(seq);
		sc.close();
	}
	public void showSequence(String pre)
	{
		String prefix=pre;
		dao.display(prefix);
	}

}
