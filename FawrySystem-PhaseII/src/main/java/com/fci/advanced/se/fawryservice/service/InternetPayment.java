package com.fci.advanced.se.fawryservice.service;


import com.fci.advanced.se.fawryservice.provider.Etisalat;
import com.fci.advanced.se.fawryservice.provider.Orange;
import com.fci.advanced.se.fawryservice.provider.Provider;
import com.fci.advanced.se.fawryservice.provider.Vodafone;
import com.fci.advanced.se.fawryservice.provider.We;


public class InternetPayment implements Service {
	private String name;
	private Provider provider ;
	private double amount;
	private Discount discount;
	public InternetPayment()
	{
		name="InternetPayment";
	}
	public void internetPaymenForm(double amount,String  request)
	{	 
		this.amount=amount;
	  request=request.toLowerCase();
		if(request=="we")
		{
			this.setProvider(new We());
		}
		else if(request=="etisalat")
			
		{
			this.setProvider(new Etisalat());

		}
		else if(request=="orange")
		{			
			this.setProvider(new Orange());

		}
		else if(request=="vodafone")
		{
			this.setProvider(new Vodafone());

		}
	
	}
	public void serviceForm(double amount  ,String requests)
	{
		 internetPaymenForm( amount ,  requests);
	}
	@Override
	public double getAmount() {
		return amount;
	}
	@Override
	public Discount getDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}
	@Override
	public void updateDiscount(Discount discount) {
		this.discount=discount;
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

}
