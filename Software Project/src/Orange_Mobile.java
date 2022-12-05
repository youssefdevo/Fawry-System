import java.util.Scanner;


public class Orange_Mobile implements Orange,Provider{
	private Scanner in  = new Scanner(System.in);
	private double amount;
	public void orange_MobileFrom()
	{
		System.out.println("--Hello in Orange Mobile Recharge--");
		System.out.println("Please Enter your phone number: ");
		String phone=in.next();
		System.out.println("Please Enter The value of the balance that you want to charge: ");
		amount=in.nextDouble();

		
	}
	public void providerForm()
	{
		orange_MobileFrom();
	}
	public double getAmount()
	{
		return amount;
	}
	
}
