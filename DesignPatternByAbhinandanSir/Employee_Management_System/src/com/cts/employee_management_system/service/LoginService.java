package com.cts.employee_management_system.service;

import com.cts.employee_management_system.bean.LoginBean;

public interface LoginService {
	public String insertLogin(LoginBean loginBean);
	public boolean authenticateUser(LoginBean loginBean);

}
