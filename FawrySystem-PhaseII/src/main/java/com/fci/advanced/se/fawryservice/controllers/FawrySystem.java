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
  private SystemData data;
  private User currentUser;
  private Admin currentAdmin; 
  public static int ids = 0;
  public static int refundID = 1;
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
		
		ArrayList<User> users = SystemData.getUsers();
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
	
	public String addUser(Account acc) {
		String email = acc.getEmail();
		String uname = acc.getUsername();
		for(User i :SystemData.getUsers()) {
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
		ArrayList<String> disc = new ArrayList<>();
		for(Service d:SystemData.getServices())
		{
			if(d.getName()=="Donation")continue;
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
	
}
