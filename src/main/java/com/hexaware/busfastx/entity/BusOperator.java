package com.hexaware.busfastx.entity;

public class BusOperator {
	private int operatorId;
    private String email;
    private String password;
    private String operatorName;
    private String contactNumber;
	public BusOperator() {
		super();
	}
	public BusOperator(int operatorId, String email, String password, String operatorName, String contactNumber) {
		super();
		this.operatorId = operatorId;
		this.email = email;
		this.password = password;
		this.operatorName = operatorName;
		this.contactNumber = contactNumber;
	}
	public int getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
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
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "BussOpreator [operatorId=" + operatorId + ", email=" + email + ", password=" + password
				+ ", operatorName=" + operatorName + ", contactNumber=" + contactNumber + "]";
	}
    

}
