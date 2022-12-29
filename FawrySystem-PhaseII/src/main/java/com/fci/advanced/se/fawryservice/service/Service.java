package com.fci.advanced.se.fawryservice.service;

public abstract class Service {
	public abstract void serviceForm(double amount,String request);
	public abstract double getAmount();
//	public Discount getDiscount();
//	public void updateDiscount(Discount discount);
	public abstract String getName();
	public void setDiscount(double discount)
	{
		
	}
	
}
