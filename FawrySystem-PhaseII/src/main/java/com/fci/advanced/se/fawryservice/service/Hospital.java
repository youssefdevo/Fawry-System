package com.fci.advanced.se.fawryservice.service;

public class  Hospital implements DonationPlace {
	 private double amount;
	    public void donationForm(double amount)
	    {
	          HospitalsForm( amount );
	    }
	    public void HospitalsForm(double amount)
	    {
	    	this.amount=amount;
	    }
	    
	    public double getAmount() {
	        return amount;
	    }

}
