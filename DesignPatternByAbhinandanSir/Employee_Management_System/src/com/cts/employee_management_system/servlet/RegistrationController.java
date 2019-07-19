package com.cts.employee_management_system.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.employee_management_system.bean.RegistrationBean;
import com.cts.employee_management_system.service.RegistrationService;
import com.cts.employee_management_system.service.RegistrationServiceImpl;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationController {
	private static final long serialVersionUID = 1L;
       
   
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String empId=request.getParameter("empId");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String empSalary=request.getParameter("empSalary");
		String empDesignation=request.getParameter("empDesignation");

		RegistrationBean registrationBean=new RegistrationBean();
		registrationBean.setEmpId(empId);
		registrationBean.setFirstName(firstName);
		registrationBean.setLastName(lastName);
		registrationBean.setEmpSalary(empSalary);
		registrationBean.setEmpDesignation(empDesignation);
		RegistrationService registrationService=new RegistrationServiceImpl();

		if(registrationService.registerEmp(registrationBean)) 
			System.out.println("Registerd");
		else 
			System.out.println("Not Registerd");
		if(registrationService.validateEmp(registrationBean))
			System.out.println("Exists");
		else
			System.out.println("Can't find");
		
	}
		
		
		
}


