package com.fci.advanced.se.fawryservice.controllers;

import com.fci.advanced.se.fawryservice.entities.Account;
import com.fci.advanced.se.fawryservice.entities.SystemData;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Discount;
import com.fci.advanced.se.fawryservice.service.InternetPayment;
import com.fci.advanced.se.fawryservice.service.Landline;
import com.fci.advanced.se.fawryservice.service.MobileRecharge;
import com.fci.advanced.se.fawryservice.service.Service;


public class Admin {
	//attributes.
	private Account acc;
	
	//Parameterized constructor.
	public Admin(String name,String mail,String password){
		this.acc = new Account(name,mail,password);
	}
	//get account.
	public Account getAccount() {
		return this.acc;
	}
	//to add or update specific discount. 
	public void notifySpecific(String serviceName,Discount discount) {
		SystemData data = SystemData.getInstance();
		serviceName = serviceName.toLowerCase();
		//if service found before we delete it and at it again with updated value.
		for(Service s: data.getServices()) {
			String name = s.getName();
			name = name.toLowerCase();
			if(name.contains(serviceName)) {
				data.getServices().remove(s);
				break;
			}
		}
	
		if(serviceName.contains("internet")) {
			Service s = new InternetPayment();
			s.setDiscount_Amount(discount.getDiscount_amount());
			s.updateDiscount(discount);
			data.addService(s);
		}
		else if(serviceName.contains("mobile")) {
			Service s = new MobileRecharge();
			s.setDiscount_Amount(discount.getDiscount_amount());
			s.updateDiscount(discount);
			data.addService(s);
		}
		else if(serviceName.contains("landline")) {
			Service s = new Landline();
			s.setDiscount_Amount(discount.getDiscount_amount());
			s.updateDiscount(discount);
			data.addService(s);
		}

	}
	//add overall discount to all users for the first transaction. 
	public void notifyOverAll(Discount dis) {
		SystemData data = SystemData.getInstance();
		for(User u:data.getUsers()) {
			if(u.getTransactions().size()==0)
				u.updateDiscount(dis);
		}
	}
}