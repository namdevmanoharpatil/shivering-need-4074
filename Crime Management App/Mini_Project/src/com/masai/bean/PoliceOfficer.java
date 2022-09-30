package com.masai.bean;

public class PoliceOfficer {

	String Username;
	String Password;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "PoliceOfficer [Username=" + Username + ", Password=" + Password + "]";
	}

	public PoliceOfficer(String username, String password) {
		super();
		Username = username;
		Password = password;
	}

	public PoliceOfficer() {
		super();

	}

}
