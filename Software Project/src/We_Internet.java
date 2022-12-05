import java.util.Scanner;


public class We_Internet implements  We,Provider{
	private Scanner in  = new Scanner(System.in);
	private double amount;
	public void we_InternetFrom()
	{
		System.out.println("--Hello in We Internet--");
		System.out.println("Please Enter your E-mail: ");
		String email=in.next();
		System.out.println("Please Enter Your Password: ");
		String password=in.next();
		System.out.println("Please Enter : ");
		amount=in.nextDouble();
	}
	
	public void providerForm()
	{
		we_InternetFrom();
	}
	public double getAmount()
	{
		return amount;
	}
	
}