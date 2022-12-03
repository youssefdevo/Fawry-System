import java.util.Scanner;


public class Etisalat_Internet extends Etisalat{
	private Scanner in  = new Scanner(System.in);
	public void etisalat_InternetFrom()
	{
		System.out.print("--Hello in Etisalat Internet--");
		System.out.print("Please Enter your E-mail: ");
		String email=in.next();
		System.out.print("Please Enter Your Password: ");
		String password=in.next();
		System.out.print("Please Enter : ");
		int cost=in.nextInt();
		
	}
	
	public void providerForm()
	{
		etisalat_InternetFrom();
	}
	
}