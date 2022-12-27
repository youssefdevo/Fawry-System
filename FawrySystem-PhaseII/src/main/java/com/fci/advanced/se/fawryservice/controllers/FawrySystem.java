package com.fci.advanced.se.fawryservice.controllers;
import java.util.ArrayList;

import com.fci.advanced.se.fawryservice.entities.SystemData;

import Admin;
import User;


public class FawrySystem {
  private SystemData data;
  private User currentUser;
  private Admin currentAdmin; 
  
	private static FawrySystem instance = new FawrySystem();

	FawrySystem(){
		data=SystemData.getInstance();
	}

  //Get the only object available
	public static FawrySystem  getInstance(){
     return instance;
	}	
	
	public boolean validate_AdminAccount(String username,String password){
		ArrayList<Admin>admins = data.getAdmins();
		for(Admin i :admins) {
			if(i.getAccount().getUsername().equals(username) && i.getAccount().getPassword().equals(password)) {
				this.setCurrentAdmin(i);
				return true;
			}
		}
		return false;
	}
	
	public boolean validate_UserAccount(String username,String password) {
		ArrayList<User> users = data.getUsers();
		for(User i :users) {
			if(i.getAccount().getUsername().equals(username) && i.getAccount().getPassword().equals(password)) {
				this.setCurrentUser(i);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Refund> requestRefunds(){
		return data.getRefunds();
	}
	
	public void accRefund(int index) {
		
		data.acceptRefund(index);
		currentUser.getWallet().addBalance(currentUser.getTransactions().get(index-1).getAmount());
	}
	public void rejecRefund(int index) {
		
		data.rejectRefund(index);
	}
	
	public void addUser(User user) {
		data.addUser(user);
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public void addTransaction(String type, double amount) {
		Transaction transaction = new Transaction(currentUser.getAccount().getUsername(),type,amount);
		currentUser.addTransaction(transaction);
	}
	
	public void viewDiscounts() {
		for(Service d:data.getServices())
		{
			if(d.getName()=="Donation")continue;
			System.out.println(d.getName()+": "+ d.getDiscount().getDiscount_amount() + " %");
		}
		
	}

	public void setOverAll(Discount dis) {
		currentAdmin.notifyOverAll(dis);
	}
	
	public void setSpecific(String name, Discount dis) {
		currentAdmin.notifySpecific(name, dis);
	}
	
	public Admin getCurrentAdmin() {
		return currentAdmin;
	}

	public void setCurrentAdmin(Admin currentAdmin) {
		this.currentAdmin = currentAdmin;
	}

	public void viewTransactions() {
		int c = 1;
		for(Transaction t:currentUser.getTransactions()) {
			System.out.print((c++)+"- ");
			t.printTransaction();
		}
	}

	public void addRefund(int index) {
		currentUser.getTransactions().get(index).setState("Pending");
		Refund r = new Refund(currentUser.getTransactions().get(index));
		data.addRefund(r);
		
	}

	public void chargeWallet(double amount) {
		currentUser.chargeMyWallet(amount);
		System.out.println("your balance now = " + currentUser.getWallet().getBalance());
		
	}
	
}
