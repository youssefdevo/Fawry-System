import java.util.Scanner;


public class Orange_Mobile extends Orange{
	private Scanner in  = new Scanner(System.in);
	public void orange_MobileFrom()
	{
		System.out.print("--Hello in Orange Mobile Recharge--");
		System.out.print("Please Enter your phone number: ");
		String phone=in.next();
		System.out.print("Please Enter The value of the balance that you want to charge: ");
		int cost=in.nextInt();

		
	}
	public void providerForm()
	{
		orange_MobileFrom();
	}
	
}
