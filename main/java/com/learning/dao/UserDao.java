package com.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.learning.dbutil.DBConnection;
import com.learning.model.AddCourse;
import com.learning.model.Contact;
import com.learning.model.Feedback;
import com.learning.model.User;

public class UserDao {
	public boolean addUser(User user) throws SQLException, ParseException
    {
   	 Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into user1 values(userid.nextVal,?,?,?,?,?,?)");
        //ps.setInt(1,106);
        ps.setString(1, user.getName());
        ps.setLong(2, user.getNumber());
        ps.setString(3,user.getEmail());
        ps.setString(4,user.getAddress());
        System.out.println(user.getRegDate());
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(user.getRegDate()); 
        long ms1=date1.getTime();
        java.sql.Date d1=new java.sql.Date(ms1);
        
        ps.setDate(5, d1);
        ps.setString(6,user.getPassword());
       
        int x=ps.executeUpdate();
        if(x==0)
            return false;
        else
            return true;
    }
	
    public static boolean isUserValid(User user) throws SQLException, ParseException
    {     
    		boolean validStatus = false;

	       
		Connection conn = DBConnection.getConnection();
		Statement st= conn.createStatement();
		ResultSet rs= st.executeQuery("SELECT * FROM user1 WHERE email = '"+user.getEmail()+"' AND password = '"+user.getPassword()+"'");
		while(rs.next())
		{
			validStatus = true;
		}
		
   // DBConnection.closeConnection();
		
    
	return validStatus;
    }
    
    
    
    public boolean addFeedback(Feedback add) throws SQLException, ParseException
    {
   	 Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into feedback values(?,?,?,?,?)");
        //ps.setInt(1,106);
        ps.setInt(1, add.getUserId());
        ps.setString(2, add.getName());
        ps.setString(3,add.getEmail());
        ps.setString(4,add.getUserId()+"feed");
        ps.setString(5,add.getFeedback());
        int x=ps.executeUpdate();
        if(x==0)
            return false;
        else
            return true;
    }
    
    
    public boolean addContact(Contact add) throws SQLException, ParseException
    {
   	 Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into contact values(?,?,?,?,?,?)");
        //ps.setInt(1,106);
        ps.setInt(1, add.getUserId());
        ps.setString(2, add.getName());
        ps.setString(3,add.getEmail());
        ps.setLong(4,add.getPhoneNo());
        ps.setString(5,add.getMessage());
        ps.setString(6,add.getUserId()+"contact");
        
        int x=ps.executeUpdate();
        if(x==0)
            return false;
        else
            return true;
    }
    
    public ArrayList<AddCourse> getCourses() throws SQLException {
		Connection conn=DBConnection.getConnection();
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from course");
		ArrayList<AddCourse> arr=new ArrayList<AddCourse>();
		while(rs.next())
		{
			AddCourse courses=new AddCourse();
			courses.setCourseId(rs.getInt(1));
			courses.setCourseName(rs.getString(2));
			courses.setCourseDesc(rs.getString(3));
			courses.setCourseFees(rs.getInt(4));
			arr.add(courses);
		}
		return arr;
	}
    
  
}




