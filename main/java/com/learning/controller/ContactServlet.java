package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.dao.UserDao;
import com.learning.model.Contact;

/**
 * Servlet implementation class ContactServlet
 */
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  Contact add=new Contact();
		   add.setUserId(Integer.parseInt(request.getParameter("userId")));
	       add.setName(request.getParameter("name"));
	       add.setEmail(request.getParameter("email"));
	       add.setPhoneNo(Long.parseLong(request.getParameter("phoneNo")));
	       add.setMessage(request.getParameter("message"));;
	       UserDao temp=new UserDao();
	       try {
			boolean contactAdded=temp.addContact(add);
			if(contactAdded)
			{
			 response.sendRedirect("contactSuccess.jsp");
			}
		} catch (SQLException e) {
			System.out.println("Throwing sql Exception while adding Contact");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Throwing parse Exception while adding Contact");
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
