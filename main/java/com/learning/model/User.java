package com.learning.model;

public class User {
	 private String name;
	  private long number;
	  private String email;
	  private String address;
	  private String regDate;
	  private String password;
	  private String photo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	  @Override
		public String toString() {
			return "User [name=" + name + ", number=" + number + ", email=" + email + ", address=" + address + ", regDate="
					+ regDate + ", password=" + password + ", photo=" + photo + "]";
		}
}
