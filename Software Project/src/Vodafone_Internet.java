import java.util.Scanner;


public class Vodafone_Internet extends Vodafone{
	private Scanner in  = new Scanner(System.in);
	public void vodafone_InternetFrom()
	{
		System.out.print("--Hello in Vodafone Internet--");
		System.out.print("Please Enter your E-mail: ");
		String email=in.next();
		System.out.print("Please Enter Your Password: ");
		String password=in.next();
		System.out.print("Please Enter : ");
		int cost=in.nextInt();
	}
	
	public void providerForm()
	{
		vodafone_InternetFrom();
	}
	
}
