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
	private Account acc;
	public Admin(String name,String mail,String password){
		this.acc = new Account(name,mail,password);
	}
	public Account getAccount() {
		return this.acc;
	}
	
	public void notifySpecific(String serviceName,Discount discount) {
		boolean found = false;
		SystemData data = SystemData.getInstance();
		serviceName = serviceName.toLowerCase();
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
	public void notifyOverAll(Discount dis) {
		SystemData data = SystemData.getInstance();
		for(User u:data.getUsers()) {
			if(u.getTransactions().size()==0)
				u.updateDiscount(dis);
		}
	}
}