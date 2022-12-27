package com.fci.advanced.se.fawryservice.service;
import java.util.Scanner;

public class Landline implements Service {
	private String name;
	private Scanner in  = new Scanner(System.in);
	private LandlineReceipt   receipt;
	private double amount;
	private Discount discount;
	Landline()
	{
		name="Landline";
	}
	public String landlineForm(double amount ,String request)
	{
		this.amount=amount;
		  request=request.toLowerCase();
	
		if(request=="monthly")
		{
			receipt = new MonthlyReceipt();
			
			 return receipt.landLineReceiptForm(amount,request);
		}
		else if(request=="quarter")
		{
			receipt = new QuarterReceipt();
			 return receipt.landLineReceiptForm(amount,request);

		}
		return "Not found";
		
		
	}
	public String  serviceForm(double amount, String request)
	{
		 return landlineForm(amount,request);
	}
	
	public double getAmount() {
		return receipt.getAmount();
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
}
