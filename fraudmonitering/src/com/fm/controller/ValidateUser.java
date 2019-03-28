package com.fm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fm.model.inter.FormDAO;
import com.fm.model.inter.FormDAOImpl;
import com.fm.model.pojo.Form;

/**
 * Servlet implementation class ValidateUser
 */
@WebServlet("/ValidateUser.do")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("Username");
		String password=request.getParameter("Password");				
		FormDAO fd=new FormDAOImpl();
		int status=fd.validateUser(username, password);
		if(status==1)
		{
			pw.println("Welcome");
		}
		else
		{
			pw.println("Wrong");
		}
	}

}
