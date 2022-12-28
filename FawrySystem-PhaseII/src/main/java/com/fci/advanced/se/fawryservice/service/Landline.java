package com.fci.advanced.se.fawryservice.service;
import java.util.Scanner;


public class Landline implements Service {
	private String name;

	private LandlineReceipt   receipt;
	private double amount;
	private Discount discount;
	public Landline()
	{
		name="Landline";
	}
	public void landlineForm(double amount,String  request)
	{	 
		this.amount=amount;
	   request=request.toLowerCase();
		if(request=="monthly")
		{
			this.setReceipt(new MonthlyReceipt());
		}
		else if(request=="quarter")
			
		{
			this.setReceipt(new  QuarterReceipt());
		}
		
	}
	public void serviceForm(double amount  ,String request)
	{
		 landlineForm(amount,request);
	}
	
	
	public double getAmount() {
		return amount;
	}
	@Override
	public Discount getDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}
	@Override
	public void updateDiscount(Discount discount) {
		this.discount = discount;
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public LandlineReceipt getReceipt() {
		return receipt;
	}
	public void setReceipt(LandlineReceipt receipt) {
		this.receipt = receipt;
	}
}
