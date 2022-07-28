package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class UserRegister{
	
	@Id
	@Column(name="USERID")
	private int userId;
	
	
	@Column(name="FNAME",nullable=false,length=100)
	private String userFirstName;
	
	@Column(name="LNAME")
	private String userLirstName;
	
	@Column(name="PASSWORD")
	private int userPassword;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLirstName() {
		return userLirstName;
	}
	public void setUserLirstName(String userLirstName) {
		this.userLirstName = userLirstName;
	}
	public int getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(int userPassword) {
		this.userPassword = userPassword;
	}
	public UserRegister(int userId, String userFirstName, String userLirstName, int userPassword) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLirstName = userLirstName;
		this.userPassword = userPassword;
	}
	public UserRegister() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLirstName=" + userLirstName
				+ ", userPassword=" + userPassword + "]";
	}
}