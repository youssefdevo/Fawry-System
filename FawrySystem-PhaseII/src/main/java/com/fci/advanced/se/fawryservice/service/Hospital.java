package com.fci.advanced.se.fawryservice.service;

//when user want to donate to hospital.
public class  Hospital implements DonationPlace {
	//attributes
	private double amount;
	 //setters and getters.
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

