import java.util.Scanner;


public class Vodafone_Internet implements Vodafone,Provider{
	private Scanner in  = new Scanner(System.in);
	private int amount;
	public void vodafone_InternetFrom()
	{
		System.out.print("--Hello in Vodafone Internet--");
		System.out.print("Please Enter your E-mail: ");
		String email=in.next();
		System.out.print("Please Enter Your Password: ");
		String password=in.next();
		System.out.print("Please Enter : ");
		amount=in.nextInt();
	}
	
	public void providerForm()
	{
		vodafone_InternetFrom();
	}
	public int getAmount()
	{
		return amount;
	}
	
}
