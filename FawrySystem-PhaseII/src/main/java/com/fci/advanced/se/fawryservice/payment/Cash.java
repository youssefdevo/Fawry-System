package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Service;

public class Cash extends Payment{
	public Cash(Service service, User currentUser) {
		super(service,currentUser);
	}
	public String pay(double amount) {
		return "Transaction completed successfully (paied via cash).";
	}

}
