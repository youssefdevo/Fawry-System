package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Discount;
import com.fci.advanced.se.fawryservice.service.Service;


public abstract class Payment {
	private Service service;
	private Discount discount;
	private User user;
	Payment(){}
	Payment(Service s){this.service = s;}
	Payment(Service s,User u)
	{
		this.user = u;
		this.service = s;
		discount = u.getOverall_discount();
		discount.wrapDiscount(s.getDiscount());
	}
	public abstract void pay(double amount);
	public double price()
	{
		double dis=(service.getAmount()*discount.applyDiscount())/100;
		double total =service.getAmount() - dis;
		return total;
		//return 100.0;
	}	
	
	
}

