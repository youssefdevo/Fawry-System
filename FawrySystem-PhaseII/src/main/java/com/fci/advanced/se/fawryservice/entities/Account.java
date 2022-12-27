package com.fci.advanced.se.fawryservice.entities;

public class Account {
	
	private String username;
	private String password;
	private String email;
	
	//Constructor
	public Account(String name,String mail,String pass){
		
		this.setUsername(name);
		this.setPassword(pass);
		this.setEmail(mail);
	}
	
	// Setters and getters 
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
