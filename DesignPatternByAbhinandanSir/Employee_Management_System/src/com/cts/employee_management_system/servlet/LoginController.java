package com.cts.employee_management_system.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.employee_management_system.bean.LoginBean;
import com.cts.employee_management_system.service.LoginService;
import com.cts.employee_management_system.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginController{
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String userName = request.getParameter("userName");
		String password= request.getParameter("password");
		LoginBean bean=new LoginBean();
		bean.setUserName(userName);
		bean.setPassword(password);
		LoginService loginService=new LoginServiceImpl();
		if(loginService.authenticateUser(bean)) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login fail");
		}
		
		
		
	}

}
