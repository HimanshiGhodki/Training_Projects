package com.cts.employee_management_system.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.employee_management_system.bean.LoginBean;
import com.cts.employee_management_system.util.DBUtils;


public class LoginDAOImpl implements LoginDAO {

	@Override
	public String insertLogin(LoginBean loginBean) {
		
		Connection connection=null;
		try {
		PreparedStatement preparedStatement=null;
		String query="insert into Login(userName,password) values(?,?)";
		connection=DBUtils.getConnection();
		preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1,loginBean.getUserName());
		preparedStatement.setString(2, loginBean.getPassword());
		connection.commit();
		
		}
		catch(SQLException e) {
			try {
				connection.rollback();
			}
			catch (SQLException exception) {
				exception.printStackTrace();
			}
			e.printStackTrace();	
		}
		
		finally {
			DBUtils.closeConnection(connection);
		}
		
		return null;
	}



	@Override
	public boolean authenticateUser(LoginBean loginBean) {
		// TODO Auto-generated method stub
		Connection connection=null;
		try {
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		String query="select * from Login where userName=? and password=?";
		connection=DBUtils.getConnection();
		preparedStatement=connection.prepareStatement(query);
		preparedStatement.setString(1, loginBean.getUserName());
		preparedStatement.setString(2, loginBean.getPassword());
		resultSet= preparedStatement.executeQuery();
		
		if(resultSet.next()) {
			return true;
		}
		else {
			return false;
		}
		
		}
		catch(SQLException e) {
		e.printStackTrace();
		return false;
		}
	}


}
