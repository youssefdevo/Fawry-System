package com.fci.advanced.se.fawryservice.service;
import java.util.Scanner;

public class Donation implements Service {
	private String name;
	private Scanner in  = new Scanner(System.in);
	private DonationPlace place;
	private double amount;
	Donation ()
	{
		name="Donation";
	}
	public String  donationForm(double amount,String request)
	{
		
		  this.amount=amount;
		  request=request.toLowerCase();
		
		if(request=="schools")
		{
		          
	           place = new School();
			 return place.donationForm(amount);
		}
		else if(request=="ngos")
		{
			 place = new NGOs();
			return place.donationForm(amount);
		
		}
		else if(request=="Hospital")
		{
			 place = new Hospital();   
			 return place.donationForm(amount);

			
		}
		
			return "Not found";
		
	}
	public String  serviceForm(double amount,String request)
	{
		 return donationForm(amount,request);
	}
	@Override
	public double getAmount() {
		return place.getAmount();
	}
	@Override
	public Discount getDiscount() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateDiscount(Discount discount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
