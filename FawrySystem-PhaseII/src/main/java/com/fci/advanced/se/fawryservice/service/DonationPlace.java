package com.fci.advanced.se.fawryservice.service;

//interface class that inherits from it (School,NGOs,Hospital).				
public interface DonationPlace {
	public void donationForm(double amuont);
	public double getAmount();
	public String getName();
	
}

