package com.learning.model;

public class Feedback {
 private  String name;
 private int userId;
 private String email; 
 private String feedback;
 private String f_id;
public String getF_id() {
	return f_id;
}
public void setF_id(String f_id) {
	this.f_id = f_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
@Override
public String toString() {
	return "Feedback [name=" + name + ", userId=" + userId + ", email=" + email + ", feedback=" + feedback + "]";
}

}
