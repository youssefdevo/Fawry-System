package com.fci.advanced.se.fawryservice.payment;

public class Wallet extends Payment {
	private  double balance;
	public Wallet()
	{
		balance=0;
	}
	public String pay(double amount) {
			
		 if(balance>=amount) {
			 balance-=amount;
			 return "Transaction completed successfully (paied via Wallet).";
		 }
		 else {
			 enoughMoney =false;
			return "there is no enough money in your wallet.";
		 }
		
	}
	public void chargingWallet(double amount){
		setBalance(getBalance() + amount);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void addBalance(double b) {
		balance+=b;
	}
	public boolean isFlag() {
		return enoughMoney;
	}
	public void setFlag(boolean flag) {
		this.enoughMoney = flag;
	}
	
}
