package com.fci.advanced.se.fawryservice.service;
import Discount;

public interface Service {
	public String serviceForm(double amount,String request);
	public double getAmount();
	public Discount getDiscount();
	public void updateDiscount(Discount discount);
	public String getName();
}
