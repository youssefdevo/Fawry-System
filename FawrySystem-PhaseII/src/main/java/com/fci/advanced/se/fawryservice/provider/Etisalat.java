package com.fci.advanced.se.fawryservice.provider;

import java.util.ArrayList;

import com.fci.advanced.se.fawryservice.service.Donation;
import com.fci.advanced.se.fawryservice.service.InternetPayment;
import com.fci.advanced.se.fawryservice.service.Landline;
import com.fci.advanced.se.fawryservice.service.MobileRecharge;
import com.fci.advanced.se.fawryservice.service.Service;

public class Etisalat implements Provider{
	public ArrayList<Service> services;
	
	public Etisalat () {
		services.add(new InternetPayment());
		services.add(new MobileRecharge());
		services.add(new Donation());
		services.add(new Landline());
	}
	@Override
	public String getName() {
		
		return "Etisalat";
	}

}

