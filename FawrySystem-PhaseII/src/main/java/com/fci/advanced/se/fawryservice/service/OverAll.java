package com.fci.advanced.se.fawryservice.service;

//OverAll discount that inherits from discount(each user has his differ discount from another).
public class OverAll extends Discount{

	public void setDiscount(double dis)
	{
		discount_amount = dis;
	}
	public double getDiscount_amount()
	{
		return discount_amount;
	}	

}
