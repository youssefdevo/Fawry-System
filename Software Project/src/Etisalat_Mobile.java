import java.util.Scanner;


public class Etisalat_Mobile implements Etisalat,Provider{
	private Scanner in  = new Scanner(System.in);
	private double amount;
	public void etisalat_MobileFrom()
	{
		System.out.print("--Hello in Etisalat Mobile Recharge--");
		System.out.print("Please Enter your phone number: ");
		String phone=in.next();
		System.out.print("Please Enter The value of the balance that you want to charge: ");
		amount=in.nextInt();

		
	}
	public void providerForm()
	{
		etisalat_MobileFrom();
	}
	public double getAmount()
	{
		return amount;
	}

}
