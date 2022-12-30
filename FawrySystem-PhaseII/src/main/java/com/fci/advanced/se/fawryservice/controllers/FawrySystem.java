package com.fci.advanced.se.fawryservice.controllers;
import java.util.ArrayList;

import com.fci.advanced.se.fawryservice.entities.Account;
import com.fci.advanced.se.fawryservice.entities.Refund;
import com.fci.advanced.se.fawryservice.entities.SystemData;
import com.fci.advanced.se.fawryservice.entities.Transaction;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Discount;
import com.fci.advanced.se.fawryservice.service.Service;

public class FawrySystem {
	  private User currentUser;
	  private Admin currentAdmin; 
	  public static int ids = 0;
	  public static int refundID = 1;
	  private static FawrySystem instance = new FawrySystem();

  //Get the only object available
	public static FawrySystem  getInstance(){
     return instance;
	}	
	
	public boolean validate_AdminAccount(String username,String password){
		SystemData data = SystemData.getInstance();
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
		SystemData data = SystemData.getInstance();
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
		SystemData data = SystemData.getInstance();
		return data.getRefunds();
	}
	
	public void accRefund(int index) {
		SystemData data = SystemData.getInstance();
		data.acceptRefund(index);
		currentUser.getWallet().addBalance(currentUser.getTransactions().get(index-1).getAmount());
	}
	public void rejecRefund(int index) {
		SystemData data = SystemData.getInstance();
		data.rejectRefund(index);
	}
	
	public String addUser(Account acc) {
		SystemData data = SystemData.getInstance();
		String email = acc.getEmail();
		String uname = acc.getUsername();
		for(User i :data.getUsers()) {
			if(i.getAccount().getEmail().equals(email)) 
				return "this email in already exit";
			
			if(i.getAccount().getUsername().equals(uname)) 
				return "this user name in already exit";
			
		}
		User user = new User(acc);
		data.addUser(user);
		return "Signed up succussfully";
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
	
	public ArrayList<String> viewDiscounts() {
		SystemData data = SystemData.getInstance();
		ArrayList<String> disc = new ArrayList<>();
		for(Service d:data.getServices())
		{
			disc.add(d.getName()+": "+ d.getDiscount().getDiscount_amount() + " %");
		}
		return disc;
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

	public ArrayList<Transaction> viewTransactions() {
		return currentUser.getTransactions();
	}

	public String addRefund(int index) {
		SystemData data = SystemData.getInstance();
		if(currentUser.getTransactions().get(index).getState().equals("Pending"))
			return "this refund already exist.";
		currentUser.getTransactions().get(index).setState("Pending");
		Refund r = new Refund(currentUser.getTransactions().get(index));
		data.addRefund(r);
		return "Refund has been requested";
		
	}

	public String chargeWallet(double amount) {
		currentUser.chargeMyWallet(amount);
		return "your balance now = " + currentUser.getWallet().getBalance();
		
	}

	public ArrayList<User> getHistroy() {
		SystemData data = SystemData.getInstance();
		return data.getUsers();
	}
	
}
