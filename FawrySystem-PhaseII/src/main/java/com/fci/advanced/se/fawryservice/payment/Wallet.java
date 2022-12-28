package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Service;


public class Wallet extends Payment {
	private CreditCard creditcard;
	private  double balance;
	
	public Wallet()
	{
		balance=0;
	}
	public Wallet(Service service, User currentUser) {
		super(service,currentUser);
	}
	public String pay(double amount) {
			
		 if(balance>=amount) {
			 return "Transaction completed successfully (paied via Wallet).";
		 }
		 else {
			return "there is no enough money in your wallet\n\n";
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

}
