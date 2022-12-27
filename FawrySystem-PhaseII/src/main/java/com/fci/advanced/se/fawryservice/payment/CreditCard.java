package com.fci.advanced.se.fawryservice.payment;
import java.util.Scanner;


public class CreditCard extends Payment{
	
	private String creditCardNumber;
	private Scanner in = new Scanner(System.in);
	public CreditCard(Service service, User currentUser) {
		super(service,currentUser);
	}
	public void pay(double amount) {
		System.out.println("Enter the credit card number:");
		// TODO Auto-generated method stub
		creditCardNumber = in.nextLine();

		System.out.println("Transaction completed successfully\n\n");
	}

}
