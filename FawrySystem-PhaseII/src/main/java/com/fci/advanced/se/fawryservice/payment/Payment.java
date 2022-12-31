package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Service;

public abstract class Payment {
	protected boolean enoughMoney;
	public abstract String pay(double amount);
	public double price(Service service,User user)
	{
		double dis = ((user.getOverall_discount().getDiscount_amount()+service.getDiscount_Amount())*service.getAmount())/100;
		
		double total =service.getAmount() - dis;
		return total;
	}
		
	
	public abstract boolean isFlag();
	public abstract void setFlag(boolean flag);
}

