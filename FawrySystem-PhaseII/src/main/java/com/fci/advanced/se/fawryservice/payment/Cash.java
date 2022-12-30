package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Service;

public class Cash extends Payment{
	private boolean flag ;
	public Cash(Service service, User currentUser) {
		super(service,currentUser);
		flag = true;
	}
	public String pay(double amount) {
		return "Transaction completed successfully (paied via cash).";
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
