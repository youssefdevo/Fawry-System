package com.fci.advanced.se.fawryservice.entities;
import com.fci.advanced.se.fawryservice.controllers.FawrySystem;

//Transaction Class.
public class Transaction {
	// Id of the transaction to be easy to access it by id.
	private  int id;
	//user's name that did this transaction
	private String username;
	//service name.
	private String service_type;
	//cost of this transaction.
	private double amount;
	//state of this transaction.
	private String state;
	
	// Parameterized constructor
	public Transaction(String username,String serviceType,double amount){
		this.setUsername(username);
		this.setService_type(serviceType);
		this.setAmount(amount);
		this.setState("Completed");
		setId(FawrySystem.ids++);
	}
	
	//setters and getters.
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String name) {
		this.username = name;
	}
	
	public String getService_type() {
		return service_type;
	}
		
	public void setService_type(String type) {
		this.service_type = type;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



		
}
