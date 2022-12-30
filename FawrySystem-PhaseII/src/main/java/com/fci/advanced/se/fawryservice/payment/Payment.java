package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Discount;
import com.fci.advanced.se.fawryservice.service.Service;

public abstract class Payment {
	private Service service;
	private Discount discount;
	Payment(){}
	Payment(Service s){this.service = s;}
	Payment(Service s,User u)
	{
		
		this.service = s;
		discount = u.getOverall_discount();
		discount.wrapDiscount(s.getDiscount());
	}
	
	public abstract String pay(double amount);
	public double price()
	{
		double dis=(getService().getAmount()*discount.applyDiscount())/100;
		double total =getService().getAmount() - dis;
		return total;
		//return 100.0;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service,User u) {
		this.service = service;
		discount=u.getOverall_discount();
		discount.wrapDiscount(service.getDiscount());
	}	
	
	
}

