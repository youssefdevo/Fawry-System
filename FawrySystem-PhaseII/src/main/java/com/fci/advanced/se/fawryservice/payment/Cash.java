package com.fci.advanced.se.fawryservice.payment;
//Cash Class.
public class Cash extends Payment{
	//payment process.
	public String pay(double amount) {
		return "Transaction completed successfully (paied via cash).";
	}
	//setters and getters.
	public boolean isFlag() {
		return enoughMoney;
	}
	public void setFlag(boolean flag) {
		this.enoughMoney = flag;
	}

}
