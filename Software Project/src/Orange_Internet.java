import java.util.Scanner;


public class Orange_Internet implements Orange,Provider{
	private Scanner in  = new Scanner(System.in);
	private int amount;
	public void orange_InternetFrom()
	{
		System.out.print("--Hello in Orange Internet--");
		System.out.print("Please Enter your E-mail: ");
		String email=in.next();
		System.out.print("Please Enter Your Password: ");
		String password=in.next();
		System.out.print("Please Enter : ");
		amount=in.nextInt();
		
	}
	
	public void providerForm()
	{
		orange_InternetFrom();
	}
	public int getAmount()
	{
		return amount;
	}

}
