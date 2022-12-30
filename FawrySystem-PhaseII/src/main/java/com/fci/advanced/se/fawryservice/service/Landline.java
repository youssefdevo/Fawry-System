package com.fci.advanced.se.fawryservice.service;



public class Landline implements Service {
	private String name;
	private static double landline_discount = 0;
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
	
	@Override
	public void setDiscount_Amount(double amount) {
		landline_discount = amount;
		
	}
	@Override
	public double getDiscount_Amount() {
		return landline_discount;
	}
}
