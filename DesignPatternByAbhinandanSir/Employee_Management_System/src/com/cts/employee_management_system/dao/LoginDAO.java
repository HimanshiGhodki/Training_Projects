package com.cts.employee_management_system.dao;

import com.cts.employee_management_system.bean.LoginBean;

public interface LoginDAO {
	public String insertLogin(LoginBean loginBean);
	public boolean authenticateUser(LoginBean loginBean);	
}
