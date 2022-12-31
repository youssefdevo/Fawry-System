package com.fci.advanced.se.fawryservice.service;
import com.fci.advanced.se.fawryservice.provider.Etisalat;
import com.fci.advanced.se.fawryservice.provider.Orange;
import com.fci.advanced.se.fawryservice.provider.Provider;
import com.fci.advanced.se.fawryservice.provider.Vodafone;
import com.fci.advanced.se.fawryservice.provider.We;

//when user select InternetPayment service.
public class InternetPayment implements Service {
	//the name of this service.
	private String name;
	//the provider of this service.
	private Provider provider ;
	//the cost of this service.
	private double amount;
	//the specific discount of this service.
	private Discount discount;
	private static double internet_discount = 0;
	
	//default constructor.
	public InternetPayment()
	{
		name="InternetPayment";
	}
	//form that select provider depending on user request.
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
	
	//setter and getters.

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

	@Override
	public void setDiscount_Amount(double amount) {
		internet_discount = amount;
		
	}
	@Override
	public double getDiscount_Amount() {
		return internet_discount;
	}

}
