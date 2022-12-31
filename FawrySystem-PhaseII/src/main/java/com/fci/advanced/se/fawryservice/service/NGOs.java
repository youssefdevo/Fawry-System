package com.fci.advanced.se.fawryservice.service;

//when user select to donate to NGOs.
public class NGOs implements DonationPlace{
	//attributes
    private double amount;
    
    //setters && getters
    public void donationForm(double amount)
    {
         NGOsForm(amount);
    }
    public void NGOsForm(double price)
    {
    	this.amount = price;
    }
    
    public double getAmount() {
        return amount;
    }
}