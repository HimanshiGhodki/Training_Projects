package com.cts.DaoSequenceWithoutBean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SequenceRowMapper implements RowMapper<Sequence>
{
	public Sequence mapRow(ResultSet rs, int rownum) throws SQLException
	{
		Sequence seq = new Sequence(rs.getString(1) , rs.getInt(2) , rs.getString(3));
		return seq;
	}

}
