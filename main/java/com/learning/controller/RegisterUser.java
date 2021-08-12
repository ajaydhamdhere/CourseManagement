package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.dao.UserDao;
import com.learning.model.User;

/**
 * Servlet implementation class RegisterUser
 */
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet called");
		

       
       User user=new User();
       user.setName(request.getParameter("name"));
       user.setEmail(request.getParameter("email"));
       user.setAddress(request.getParameter("address"));
       user.setNumber(Long.parseLong(request.getParameter("phoneno")));
       user.setPassword(request.getParameter("password"));
       user.setRegDate(request.getParameter("regdate"));
       
       UserDao temp=new UserDao();
       try {
		boolean userAdded=temp.addUser(user);
		if(userAdded)
		{
		 response.sendRedirect("UserLogin.jsp");
		}
	} catch (SQLException e) {
		System.out.println("Throwing sql Exception while adding user");
		e.printStackTrace();
	} catch (ParseException e) {
		System.out.println("Throwing parse Exception while adding user");
		e.printStackTrace();
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
