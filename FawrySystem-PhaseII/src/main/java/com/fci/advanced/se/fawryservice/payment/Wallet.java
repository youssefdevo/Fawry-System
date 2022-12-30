package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Service;

public class Wallet extends Payment {
	private CreditCard creditcard;
	private  double balance;
	private boolean flag;
	public Wallet()
	{
		balance=0;
	}
	public Wallet(Service service, User currentUser) {
		super(service,currentUser);
		flag = true;
	}
	public String pay(double amount) {
			
		 if(balance>=amount) {
			 balance-=amount;
			 return "Transaction completed successfully (paied via Wallet).";
		 }
		 else {
			 flag =false;
			return "there is no enough money in your wallet.";
		 }
		
	}
	public void chargingWallet(double amount){
		setBalance(getBalance() + amount);
	}
	public CreditCard getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
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
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
