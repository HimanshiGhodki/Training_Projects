package com.cts.employee_management_system.service;

import com.cts.employee_management_system.bean.RegistrationBean;
import com.cts.employee_management_system.dao.RegistrationDAO;
import com.cts.employee_management_system.dao.RegistrationDAOImpl;


public class RegistrationServiceImpl implements RegistrationService {
	RegistrationDAO registrationDAO= new RegistrationDAOImpl();
		
	@Override
	public boolean registerEmp(RegistrationBean registrationBean) {
		return registrationDAO.registerEmp(registrationBean);
	}

	@Override
	public boolean validateEmp(RegistrationBean registrationBean) {
		return registrationDAO.validateEmp(registrationBean);
	}

}
