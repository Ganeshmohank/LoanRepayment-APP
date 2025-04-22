package com.capstone.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	private int custid;
	private String password;
	private String username;
	private String email;

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int custid, String password, String username, String email) {
		super();
		this.custid = custid;
		this.password = password;
		this.username = username;
		this.email = email;
	}

	@Override
	public String toString() {
		return "users [custid=" + custid + ", password=" + password + ", username=" + username + ", email=" + email
				+ "]";
	}
}
