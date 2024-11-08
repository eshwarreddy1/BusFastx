package com.hexaware.busfastx.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	private int adminId;
    private String email;
    private String password;
    private Timestamp createdAt;
	public Admin() {
		super();
	}
	public Admin(int adminId, String email, String password, Timestamp createdAt) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.password = password;
		this.createdAt = createdAt;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
    
    

}
