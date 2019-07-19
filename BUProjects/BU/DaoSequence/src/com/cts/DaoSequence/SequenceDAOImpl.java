package com.cts.DaoSequence;

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

	@Override
	public int insertSequence(Sequence s) {
		
		Object []arr = {s.getPrefix() , s.getInitial() , s.getSuffix()};
		int n = jdt.update("insert into sequence values(?,?,?)", arr);
		for(int i=0;i<10;i++) 
		{
			System.out.println(s.getSequence());
		}
		return n;
	}

	@Override
	public void display(String prefix) 
	{
		Object [] param= {prefix};
		Sequence seq=jdt.queryForObject("select * from sequence where prefix = ?", param, new SequenceRowMapper());
		seq.getSequence();
		for(int i=0;i<10;i++) 
		{
			System.out.println(seq.getSequence());
		}
	}

	
}
