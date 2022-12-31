package com.fci.advanced.se.fawryservice.service;

//when user choose to donate to school.
public class School implements DonationPlace {
    private double amount;
    public void donationForm(double amount)
    {
          schoolForm( amount );
    }
    public void schoolForm(double amount)
    {
    	this.amount=amount;
    }
    
    public double getAmount() {
        return amount;
    }
	@Override
	public String getName() {
		return "School";
	}
	
}