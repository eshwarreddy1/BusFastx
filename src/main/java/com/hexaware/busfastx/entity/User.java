package com.hexaware.busfastx.entity;

public class User {
    private int userId;
    private String email;
    private String password;
    private String name;
    private String contactNumber;
	public User() {
		super();
	}
	public User(int userId, String email, String password, String name, String contactNumber) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.contactNumber = contactNumber;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", name=" + name
				+ ", contactNumber=" + contactNumber + "]";
	}
    

}
