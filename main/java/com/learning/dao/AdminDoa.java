package com.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;

import com.learning.dbutil.DBConnection;
import com.learning.model.AddCourse;
import com.learning.model.Admin;
import com.learning.model.User;
import com.learning.model.Feedback;
import com.learning.model.Contact;
public class AdminDoa {
	public static boolean isAdminValid(Admin admin) throws SQLException, ParseException
    {     
    		boolean validStatus = false;

	       
		Connection conn = DBConnection.getConnection();
		Statement st= conn.createStatement();
		ResultSet rs= st.executeQuery("SELECT * FROM Admin WHERE  admin_id = '"+admin.getAdminId()+"' AND password = '"+admin.getPassword()+"'");
		while(rs.next())
		{
			validStatus = true;
		}
		
   // DBConnection.closeConnection();
		
    
	return validStatus;
    }
	
	 
    public boolean addCourse(AddCourse add) throws SQLException, ParseException
    {
   	 Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into course values(?,?,?,?)");
        //ps.setInt(1,106);
        ps.setInt(1, add.getCourseId());
        ps.setString(2, add.getCourseName());
        ps.setString(3,add.getCourseDesc());
        ps.setInt(4,add.getCourseFees());
        int x=ps.executeUpdate();
        if(x==0)
            return false;
        else
            return true;
    }
    
    public ArrayList<User> getUsers() throws SQLException {
  		Connection conn=DBConnection.getConnection();
  		Statement st=conn.createStatement();
  		ResultSet rs=st.executeQuery("select * from user1");
  		ArrayList<User> arr=new ArrayList<User>();
  		while(rs.next())
  		{
  			User user=new User();
  			user.setName(rs.getString(2));
  			user.setNumber(rs.getLong(3));
  			arr.add(user);
  		}
  		return arr;
  	}
    
    public ArrayList<Feedback> getFeedback() throws SQLException {
  		Connection conn=DBConnection.getConnection();
  		Statement st=conn.createStatement();
  		ResultSet rs=st.executeQuery("select * from feedback");
  		ArrayList<Feedback> arr=new ArrayList<Feedback>();
  		while(rs.next())
  		{
  			Feedback user=new Feedback();
  			user.setUserId(rs.getInt(1));
  			user.setName(rs.getString(2));
  			user.setEmail(rs.getString(3));
  			user.setF_id(rs.getString(4));
  			user.setFeedback(rs.getString(5));
  			arr.add(user);
  		}
  		return arr;
  	}
    
    
    public ArrayList<Contact> getContact() throws SQLException {
  		Connection conn=DBConnection.getConnection();
  		Statement st=conn.createStatement();
  		ResultSet rs=st.executeQuery("select * from contact");
  		ArrayList<Contact> arr=new ArrayList<Contact>();
  		while(rs.next())
  		{
  			Contact user=new Contact();
  			user.setUserId(rs.getInt(1));
  			user.setName(rs.getString(2));
  			user.setEmail(rs.getString(3));
  			user.setPhoneNo(rs.getLong(4));
  			user.setMessage(rs.getString(5));
  			arr.add(user);
  		}
  		return arr;
    }
    
}
