package com.fci.advanced.se.fawryservice.service;


public class QuarterReceipt implements LandlineReceipt {
	private double amount;
	
	public String quarterReceoptForm(double amuont ,String request )
	{
		this.amount=amount;
		 return "Successfully paid for Quarter rececpit :";
		
	}
	public String landLineReceiptForm(double amuont ,String request)
	{
		 return quarterReceoptForm(amuont,request);
	}
	
	public double getAmount()
	{
		return amount;
	}
	
}