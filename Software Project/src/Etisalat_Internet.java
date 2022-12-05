import java.util.Scanner;


public class Etisalat_Internet implements Etisalat,Provider{
	private Scanner in  = new Scanner(System.in);
	private double amount;
	public void etisalat_InternetFrom()
	{
		System.out.println("--Hello in Etisalat Internet--");
		System.out.println("Please Enter your E-mail: ");
		String email=in.next();
		System.out.println("Please Enter Your Password: ");
		String password=in.next();
		System.out.println("Please Enter : ");
		amount=in.nextDouble();
		
	}
	
	public void providerForm()
	{
		etisalat_InternetFrom();
	}
	public double getAmount()
	{
		return amount;
	}
	
}