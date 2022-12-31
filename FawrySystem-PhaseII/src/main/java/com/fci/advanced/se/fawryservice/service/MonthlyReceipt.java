package com.fci.advanced.se.fawryservice.service;

//when user choose to pay landline as Monthly receipt.
public class MonthlyReceipt implements LandlineReceipt {
	private double amount;
	
	public void monthlyReceoptForm(double price ,String request )
	{
		this.amount=price;
	
	}
	public void landLineReceiptForm(double amuont ,String request)
	{
		 monthlyReceoptForm(amuont,request);
	}
	public double getAmount()
	{
		return amount;
	}
	
}
