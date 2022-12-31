package com.fci.advanced.se.fawryservice.service;

//interface class that we create from it concrete class(MonthlyReceipt, QuarterRecipet). 
public interface LandlineReceipt {
	public void landLineReceiptForm(double amount,String request);
	public double getAmount();
}
