package com.fci.advanced.se.fawryservice.payment;
import com.fci.advanced.se.fawryservice.entities.User;
import com.fci.advanced.se.fawryservice.service.Service;
//payment abstract that inherits from it (Wallet,Cash,Credit Card).
public abstract class Payment {
	//boolean to check if there is enough money to do the payment process.
	protected boolean enoughMoney;
	//abstract function that do payment process.
	public abstract String pay(double amount);
	//function that applies discount if there.
	public double price(Service service,User user)
	{
		double dis = ((user.getOverall_discount().getDiscount_amount()+service.getDiscount_Amount())*service.getAmount())/100;
		
		double total =service.getAmount() - dis;
		return total;
	}
		
	
	public abstract boolean isFlag();
	public abstract void setFlag(boolean flag);
}

