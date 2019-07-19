package com.cts.employee_management_system.service;

import com.cts.employee_management_system.bean.RegistrationBean;

public interface RegistrationService {
	public boolean registerEmp(RegistrationBean registrationBean);
	public boolean validateEmp(RegistrationBean registrationBean);

}
