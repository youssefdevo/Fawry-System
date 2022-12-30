package com.fci.advanced.se.fawryservice.entities;
import java.util.ArrayList;
import com.fci.advanced.se.fawryservice.payment.Wallet;
import com.fci.advanced.se.fawryservice.service.Discount;
import com.fci.advanced.se.fawryservice.service.OverAll;

public class User {

	private Account myAccount;
	private Wallet wallet;
	private Discount overall_discount;
	private ArrayList<Transaction> transactions;

	public User(Account acc){
		this.setAccount(acc);
		transactions = new ArrayList<>();
		wallet = new Wallet();
		this.overall_discount = new OverAll();
	}
	
	public Account getAccount() {
		return myAccount;
	}
	public void setAccount(Account myAcc) {
		this.myAccount = myAcc;
	}
	public Discount getOverall_discount() {
		return overall_discount;
	}
	public void updateDiscount(Discount overall_discount) {
		this.overall_discount = overall_discount;
	}
	public void chargeMyWallet(double amount){
		wallet.chargingWallet(amount);
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	public void addTransaction(Transaction trans) {
		transactions.add(trans);
	}

	public Wallet getWallet() {
		return wallet;
	}

}
