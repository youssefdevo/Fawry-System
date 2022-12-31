package com.fci.advanced.se.fawryservice.payment;

public class Cash extends Payment{
	public String pay(double amount) {
		return "Transaction completed successfully (paied via cash).";
	}
	public boolean isFlag() {
		return enoughMoney;
	}
	public void setFlag(boolean flag) {
		this.enoughMoney = flag;
	}

}
