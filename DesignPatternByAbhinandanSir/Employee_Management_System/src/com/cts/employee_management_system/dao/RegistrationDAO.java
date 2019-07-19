package com.cts.employee_management_system.dao;

import com.cts.employee_management_system.bean.RegistrationBean;

public interface RegistrationDAO {
	public boolean registerEmp(RegistrationBean registrationBean);
	public boolean validateEmp(RegistrationBean registrationBean);

}
