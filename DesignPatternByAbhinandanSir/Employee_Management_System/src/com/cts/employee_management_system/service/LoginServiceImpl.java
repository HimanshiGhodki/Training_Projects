package com.cts.employee_management_system.service;

import com.cts.employee_management_system.bean.LoginBean;
import com.cts.employee_management_system.dao.LoginDAO;
import com.cts.employee_management_system.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	LoginDAO loginDAO= new LoginDAOImpl();

	@Override
	public String insertLogin(LoginBean loginBean) {
		return loginDAO.insertLogin(loginBean);
	}

	@Override
	public boolean authenticateUser(LoginBean loginBean) {
		return loginDAO.authenticateUser(loginBean);
	}


}
