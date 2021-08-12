package com.learning.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.dao.UserDao;
import com.learning.model.Feedback;

/**
 * Servlet implementation class FeedBackServlet
 */
public class FeedBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedBackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   Feedback add=new Feedback();
		   add.setName(request.getParameter("name"));
		   add.setUserId(Integer.parseInt(request.getParameter("userId")));
	       add.setEmail(request.getParameter("email"));
	       add.setFeedback(request.getParameter("feedback"));
	      // add.setF_id(Integer.parseInt(request.getParameter("fIds")));
	       UserDao temp=new UserDao();
	       try {
			boolean feedbackAdded=temp.addFeedback(add);
			if(feedbackAdded)
			{
			 response.sendRedirect("feedbackSuccess.jsp");
			}
		} catch (SQLException e) {
			System.out.println("Throwing sql Exception while adding Feedback");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Throwing parse Exception while adding Feedback");
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
