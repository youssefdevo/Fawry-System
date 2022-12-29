package com.fci.advanced.se.fawryservice.service;

public class OverAll extends Discount{
	
	public OverAll()
	{
		//this.service=service;
		discount_amount=0;
	}
	
	public void setDiscount(double dis)
	{
		discount_amount = dis;
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
	
//	public void wrapDiscount(Discount d) {
//		this.discount = d;
//	}
//	
//	public double applyDiscount() {
//		double total_discount=discount_amount;
//		if(discount!=null) {
//			total_discount+=discount.applyDiscount();
//		}
//		return total_discount;
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
