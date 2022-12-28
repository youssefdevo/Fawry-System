package com.fci.advanced.se.fawryservice.provider;

import java.util.ArrayList;

import com.fci.advanced.se.fawryservice.service.Service;

public class Etisalat implements Provider{
	public ArrayList<Service> services;

	@Override
	public String getName() {
	
		return "Etisalat";
	}

}
