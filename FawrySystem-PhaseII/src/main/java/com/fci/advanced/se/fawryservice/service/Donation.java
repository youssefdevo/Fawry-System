package com.fci.advanced.se.fawryservice.service;
public class Donation implements Service {
	private String name;
	private DonationPlace place;
	private double amount;
	private static double donation_discount = 0;
	public Donation ()
	{
		name="Donation";
	}
	public void donationForm(double amount,String  request)
	{	 
		this.amount=amount;
	  request=request.toLowerCase();
		if(request.equals("school"))
		{
			this.setPlace(new School());
		}
		else if(request.equals("hospital"))
		{
			this.setPlace(new Hospital());

		}
		else if(request.equals("ngos"))
		{			
			this.setPlace(new NGOs());

		}

	}
	public void serviceForm(double amount  ,String requests)
	{
		donationForm ( amount ,  requests);
	}
	
	@Override
	public double getAmount() {
		return amount;
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
	public  DonationPlace getPlace() {
		return place;
	}
	public void setPlace(DonationPlace  place) {
		this.place = place;
	}
	
	@Override
	public void setDiscount_Amount(double amount) {
		donation_discount = amount;
	}
	@Override
	public double getDiscount_Amount() {
		return donation_discount;
	}
	
	
}

