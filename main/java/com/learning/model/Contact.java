package com.learning.model;

public class Contact {
 private int userId;
 private String name;
 private String email;
 private long phoneNo;
 private String message;
 
 
 
public Contact() {
	
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "Contact [userId=" + userId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", message="
			+ message + "]";
}
}
