package com.fci.advanced.se.fawryservice.service;
// specific discount that inherits from discount(discount on service).
public class Specific extends Discount{

	public void setDiscount(double dis)
	{
		discount_amount=dis;
	}
	public double getDiscount_amount()
	{
		return discount_amount;
	}


}