package com.fci.advanced.se.fawryservice.service;

public abstract class Discount {
	public double discount_amount = 0;
	public Service service;
	public abstract void setDiscount(double value);
	public abstract double getDiscount_amount();
	public abstract double applyDiscount();
	//public void wrapDiscount(Discount d);
	public abstract void wrapDiscount(Discount discount);
}
