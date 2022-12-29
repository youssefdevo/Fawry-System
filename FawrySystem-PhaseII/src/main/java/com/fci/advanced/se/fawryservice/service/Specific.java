package com.fci.advanced.se.fawryservice.service;

public class Specific extends Discount{
	//Discount discount;
	public Specific(Service service)
	{
		this.service=service;
		discount_amount=0;
	}
	public void setDiscount(double dis)
	{
		discount_amount=dis;
	}
	public double getDiscount_amount()
	{
		return discount_amount;
	}
	@Override
	public double getAmount() 
	{
		return discount_amount+service.getAmount();
	}
//	public double applyDiscount()
//	{
//		return getDiscount_amount();
//	}
//	@Override
//	public void wrapDiscount(Discount discount) {
//		
//	}
	@Override
	public void serviceForm(double amount, String request) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
