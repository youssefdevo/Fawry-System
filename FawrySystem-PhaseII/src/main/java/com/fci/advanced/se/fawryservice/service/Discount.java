package com.fci.advanced.se.fawryservice.service;

public abstract class Discount {
	public double discount_amount = 0;
	public abstract void setDiscount(double value);
	public abstract double getDiscount_amount();

}

