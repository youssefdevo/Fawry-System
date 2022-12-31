package com.fci.advanced.se.fawryservice.payment;
//Credit Card Class.
public class CreditCard extends Payment{
	
	//payment process.
	public String pay(double amount) {
		
		return "Transaction completed successfully (paied via credit card).";
	}
	//setters and getters.
	public boolean isFlag() {
		return enoughMoney;
	}
	public void setFlag(boolean flag) {
		this.enoughMoney = flag;
	}

}
