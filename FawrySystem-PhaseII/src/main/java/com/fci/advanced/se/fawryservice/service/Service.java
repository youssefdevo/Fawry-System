package com.fci.advanced.se.fawryservice.service;
//service class that inherits from it (MobileRecharge, internet payment,donation,Landline).
public interface Service {
	public void serviceForm(double amount,String request);
	public double getAmount();
	public Discount getDiscount();
	public void updateDiscount(Discount discount);
	public String getName();
	public void setDiscount_Amount(double amount);
	public double getDiscount_Amount();
}