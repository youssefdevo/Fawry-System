package com.fci.advanced.se.fawryservice.service;

public class School implements DonationPlace {
    private double amount;
    public void donationForm(double amount)
    {
          schoolForm( amount );
    }
    public void schoolForm(double amount)
    {
    	this.amount=amount;
      
       // return  "Thanks for your Donation for Schools.";
    }
    
    public double getAmount() {
        return amount;
    }
	
}