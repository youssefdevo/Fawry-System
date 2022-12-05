import java.util.Scanner;


public class Vodafone_Internet implements Vodafone,Provider{
	private Scanner in  = new Scanner(System.in);
	private double amount;
	public void vodafone_InternetFrom()
	{
		System.out.println("--Hello in Vodafone Internet--");
		System.out.println("Please Enter your E-mail: ");
		String email=in.next();
		System.out.println("Please Enter Your Password: ");
		String password=in.next();
		System.out.println("Please Enter amount: ");
		amount=in.nextDouble();
	}
	
	public void providerForm()
	{
		vodafone_InternetFrom();
	}
	public double getAmount()
	{
		return amount;
	}
	
}
