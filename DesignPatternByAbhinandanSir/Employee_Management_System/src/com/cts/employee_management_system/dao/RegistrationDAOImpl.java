package com.cts.employee_management_system.dao;

import java.sql.Connection;

import com.cts.employee_management_system.bean.RegistrationBean;
import com.cts.employee_management_system.util.DBUtils;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationDAOImpl implements RegistrationDAO {

	@Override
	public boolean registerEmp(RegistrationBean registrationBean) {
		// TODO Auto-generated method stub
		Connection connection=null;
		
		try {
			PreparedStatement preparedStatement=null;
			String query="insert into registration(empId, firstName, lastName, empSalary, empDesignation) values(?,?,?,?,?)";
			connection=DBUtils.getConnection();
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, registrationBean.getEmpId());
			preparedStatement.setString(2, registrationBean.getFirstName());
			preparedStatement.setString(3, registrationBean.getLastName());
			preparedStatement.setString(4, registrationBean.getEmpSalary());
			preparedStatement.setString(5, registrationBean.getEmpDesignation());
			preparedStatement.executeUpdate();
			connection.commit();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtils.closeConnection(connection);
		}
		return true;
}



	@Override
	public boolean validateEmp(RegistrationBean registrationBean) {
		Connection connection=null;
		
		try {
			PreparedStatement preparedStatement=null;
			ResultSet resultSet=null;
			String query="select * from registration where empId=? and firstName=? and lastName=? and empSalary=? and empDesignation=?";
			connection= DBUtils.getConnection();
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, registrationBean.getEmpId());
			preparedStatement.setString(2, registrationBean.getFirstName());
			preparedStatement.setString(3, registrationBean.getLastName());
			preparedStatement.setString(4, registrationBean.getEmpSalary());
			preparedStatement.setString(5, registrationBean.getEmpDesignation());
			resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
				return true;
			else
				return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally {
			DBUtils.closeConnection(connection);
		}
			}
		
		
}

	
//Front Controller Servlet
//singleton design pattern(only solution in case we want to make a single object)(used by making constructor private and static)

