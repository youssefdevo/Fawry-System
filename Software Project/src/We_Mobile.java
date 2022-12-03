import java.util.Scanner;


public class We_Mobile extends We{
	private Scanner in  = new Scanner(System.in);
	public void we_MobileFrom()
	{
		System.out.print("--Hello in We Mobile Recharge--");
		System.out.print("Please Enter your phone number: ");
		String phone=in.next();
		System.out.print("Please Enter The value of the balance that you want to charge: ");
		int cost=in.nextInt();

		
	}
	
	public void providerForm()
	{
		we_MobileFrom();
	}
	
}
