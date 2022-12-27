package com.fci.advanced.se.fawryservice.payment;
import Service;
import User;

public class Cash extends Payment{

	
	

	public Cash(Service service, User currentUser) {
		super(service,currentUser);
	}

	public void pay(double amount) {
		System.out.println("Transaction completed successfully\n\n");
	}

}
