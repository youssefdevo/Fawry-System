package com.fci.advanced.se.fawryservice.service;

public class NGOs implements DonationPlace{

	  private double amount;
	    public void donationForm(double amount)
	    {
	         NGOsForm( amount );
	    }
	    public void NGOsForm(double amount)
	    {
	    	this.amount=amount;
	      
	    }
	    
	    public double getAmount() {
	        return amount;
	    }
}