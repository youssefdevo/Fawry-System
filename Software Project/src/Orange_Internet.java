import java.util.Scanner;


public class Orange_Internet implements Orange,Provider{
	private Scanner in  = new Scanner(System.in);
	private double amount;
	public void orange_InternetFrom()
	{
		System.out.println("--Hello in Orange Internet--");
		System.out.println("Please Enter your E-mail: ");
		String email=in.next();
		System.out.println("Please Enter Your Password: ");
		String password=in.next();
		System.out.println("Please Enter : ");
		amount=in.nextDouble();
		
	}
	
	public void providerForm()
	{
		orange_InternetFrom();
	}
	public double getAmount()
	{
		return amount;
	}

}
