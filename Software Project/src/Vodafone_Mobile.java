import java.util.Scanner;


public class Vodafone_Mobile implements Vodafone,Provider{
	private Scanner in  = new Scanner(System.in);
	private int amount;
	public void vodafone_MobileFrom()
	{
		System.out.print("--Hello in Vodafone Mobile Recharge--");
		System.out.print("Please Enter your phone number: ");
		String phone=in.next();
		System.out.print("Please Enter The value of the balance that you want to charge: ");
		amount=in.nextInt();

	}	
	public void providerForm()
	{
		vodafone_MobileFrom();
	}
	public int getAmount()
	{
		return amount;
	}

	
}
