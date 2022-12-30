package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Service;

public class CreditCard extends Payment{
	private boolean flag;
	public CreditCard(Service service, User currentUser) {
		super(service,currentUser);
		setFlag(true);
	}
	public String pay(double amount) {
		
		return "Transaction completed successfully (paied via credit card).";
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
