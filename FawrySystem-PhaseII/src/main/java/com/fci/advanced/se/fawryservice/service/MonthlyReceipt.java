package com.fci.advanced.se.fawryservice.service;
import java.util.Scanner;


public class MonthlyReceipt implements LandlineReceipt {
	private Scanner in = new Scanner(System.in);
	private double amount;
	
	
	public String monthlyReceoptForm(double amuont ,String request )
	{
		this.amount=amount;
		 return "Successfully paid for monthly rececpit :";
	
	}
	public String landLineReceiptForm(double amuont ,String request)
	{
		 return monthlyReceoptForm(amuont,request);
	}
	public double getAmount()
	{
		return amount;
	}
	
}
