package com.fci.advanced.se.fawryservice.service;

//when user choose to pay landline as quarter receipt.
public class QuarterReceipt implements LandlineReceipt {
	private double amount;
	
	public void quarterReceoptForm(double price ,String request )
	{
		this.amount=price;

		
	}
	public void landLineReceiptForm(double amuont ,String request)
	{
		 quarterReceoptForm(amuont,request);
	}
	
	public double getAmount()
	{
		return amount;
	}
	
}