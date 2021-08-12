package com.learning.model;

public class AddCourse {
private int courseId;
private String courseName;
private String courseDesc;
private int courseFees;

public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public String getCourseDesc() {
	return courseDesc;
}
public void setCourseDesc(String courseDesc) {
	this.courseDesc = courseDesc;
}


public int getCourseFees() {
	return courseFees;
}
public void setCourseFees(int courseFees) {
	this.courseFees = courseFees;
}
@Override
public String toString() {
	return "AddCourse [courseId=" + courseId + ", courseName=" + courseName + ", courseDesc=" + courseDesc
			+ ", courseFees=" + courseFees + "]";
}
}