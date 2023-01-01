package com.fci.advanced.se.fawryservice.entities;
import java.util.ArrayList;
import com.fci.advanced.se.fawryservice.service.Service;

public class SystemData {
	// Admins data
	private ArrayList<Admin>admins;
	// Users data
	private ArrayList<User>users;
	// arraylist that store list of refunds.
	private ArrayList<Refund>refunds;
	//Singleton pattern.
	private static SystemData instance = new SystemData();
	//arraylist to store each service with his discount.
	private ArrayList<Service>services;

	//make the constructor private so that this class cannot be instantiated..
	private SystemData(){
		admins = new ArrayList<>();
		users = new ArrayList<>();
		services = new ArrayList<>();
		refunds  = new ArrayList<>();
		Admin defultAdmin = new Admin("admin","admin@gmail.com","123");
		admins.add(defultAdmin);
	}

   //Get the only object available
	public static SystemData getInstance(){
      return instance;
	}	
   
	//setters and getters.
	public void addAdmin(Admin admin) {
	   this.admins.add(admin);
	}
   
	public void addUser(User user) {
		
	   this.users.add(user);
	} 
	
	public void addRefund(Refund refund) {
		   this.refunds.add(refund);
	}
	
	public ArrayList<Admin> getAdmins(){
		return admins;
	}
	
	public ArrayList<User> getUsers(){
		return users;
	}
	
	public ArrayList<Refund> getRefunds(){
		return refunds;
	}
	
	//to accept refund we delete it and set the state of this transaction in user arrayList "Canceled". 
	public void acceptRefund(int index) {
		// refund = delete, transaction = cancelled.
		index--;
		refunds.get((index)).getTrans().setState("Cancelled");
		
		String curName = refunds.get(index).getTrans().getUsername();
		for(User u:this.users) {
			if(u.getAccount().getUsername()==curName) {
				u.getWallet().addBalance(u.getTransactions().get(index).getAmount());
				break;
			}
		}
		refunds.remove(index);
	}
	//to reject refund just delete it from refund list. 
	public void rejectRefund(int index){
		// refund = delete, transaction = still completed.
		index--;
		refunds.get(index).getTrans().setState("Completed");
		refunds.remove(index);
	}
	public void addService(Service s)
	{
		this.services.add(s);
	}
	public ArrayList<Service> getServices(){
		return services;
	}
	
}
