package com.cts.employee_management_system.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontControllServlet
 */
public class FrontControllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontControllServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getQueryString();
		System.out.println(action);
		if("registration".equals(action)) 
		{
			RegistrationController registrationController=new RegistrationController();
			registrationController.dispatch(request, response);
		}
		else if("login".equals(action)) 
		{
			LoginController loginController=new LoginController();
			loginController.dispatch(request, response);
		}
	}

}
