import java.util.Scanner;


public class Etisalat_Mobile extends Etisalat{
	private Scanner in  = new Scanner(System.in);
	public void etisalat_MobileFrom()
	{
		System.out.print("--Hello in Etisalat Mobile Recharge--");
		System.out.print("Please Enter your phone number: ");
		String phone=in.next();
		System.out.print("Please Enter The value of the balance that you want to charge: ");
		int cost=in.nextInt();

		
	}
	public void providerForm()
	{
		etisalat_MobileFrom();
	}

}
