package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Discount;
import com.fci.advanced.se.fawryservice.service.OverAll;
import com.fci.advanced.se.fawryservice.service.Service;

public abstract class Payment {
	private Service service;
	private Discount discount;
	private User user;
	Payment(){}
	Payment(Service s){this.service = s;}
	Payment(Service s,User u)
	{
		this.service = s;
		this.user = u;
		this.discount = new OverAll();
	}
	
	public abstract String pay(double amount);
	public double price()
	{
		double dis = ((user.getOverall_discount().getDiscount_amount()+service.getDiscount_Amount())*service.getAmount())/100;
		
		double total =getService().getAmount() - dis;
		return total;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service,User u) {
		this.service = service;
		this.user = u;
		discount=u.getOverall_discount();

	}	
	
	public abstract boolean isFlag();
	public abstract void setFlag(boolean flag);
}

