import java.util.Scanner;


public class We_Mobile implements  We,Provider{
	private Scanner in  = new Scanner(System.in);
	private double amount;
	public void we_MobileFrom()
	{
		System.out.println("--Hello in We Mobile Recharge--");
		System.out.println("Please Enter your phone number: ");
		String phone=in.next();
		System.out.println("Please Enter The value of the balance that you want to charge: ");
		amount=in.nextDouble();

		
	}
	
	public void providerForm()
	{
		we_MobileFrom();
	}
	public double getAmount()
	{
		return amount;
	}
	
}
