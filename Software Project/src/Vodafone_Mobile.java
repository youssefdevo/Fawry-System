import java.util.Scanner;


public class Vodafone_Mobile implements Vodafone,Provider{
	private Scanner in  = new Scanner(System.in);
	private double amount;
	public void vodafone_MobileFrom()
	{
		System.out.println("--Hello in Vodafone Mobile Recharge--");
		System.out.println("Please Enter your phone number: ");
		String phone=in.next();
		System.out.println("Please Enter The value of the balance that you want to charge: ");
		amount=in.nextDouble();

	}	
	public void providerForm()
	{
		vodafone_MobileFrom();
	}
	public double getAmount()
	{
		return amount;
	}

	
}
