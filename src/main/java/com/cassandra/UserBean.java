package com.cassandra;

import java.io.Serializable;
import java.util.Date;

public class UserBean implements Serializable {
    private static final long serialVersionUID = 3775871090088504659L;
 
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private int dateOfBirth;
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int i) {
		this.dateOfBirth = i;
	}
 
 
}