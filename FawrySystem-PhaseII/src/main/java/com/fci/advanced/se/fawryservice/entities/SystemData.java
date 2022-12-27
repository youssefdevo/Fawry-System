package com.fci.advanced.se.fawryservice.entities;
import java.util.ArrayList;

import com.fci.advanced.se.fawryservice.controllers.Admin;
import com.fci.advanced.se.fawryservice.service.Service;

public class SystemData {
	private static ArrayList<Admin>admins;
	private static ArrayList<User>users;
	private static ArrayList<Refund>refunds;
	private static SystemData instance = new SystemData();
	private static ArrayList<Service>services;

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
   

	public void addAdmin(Admin admin) {
	   SystemData.admins.add(admin);
	}
   
	public void addUser(User user) {
	   SystemData.users.add(user);
	} 
	
	public void addRefund(Refund refund) {
		   SystemData.refunds.add(refund);
	}
	
	public ArrayList<Admin> getAdmins(){
		return admins;
	}
	
	public static ArrayList<User> getUsers(){
		return users;
	}
	
	public ArrayList<Refund> getRefunds(){
		return refunds;
	}
	public void acceptRefund(int index) {
		// refund = delete, transaction = cancelled.
		refunds.get((index-1)).getTrans().setState("Cancelled");
		refunds.remove((index-1));

		
		
	}
	public void rejectRefund(int index){
		// refund = delete, transaction = still completed.
		refunds.get((index-1)).getTrans().setState("Completed");
		refunds.remove((index-1));
	}
	public static void addService(Service s)
	{
		services.add(s);
	}
	public static ArrayList<Service> getServices(){
		return services;
	}
	
}
