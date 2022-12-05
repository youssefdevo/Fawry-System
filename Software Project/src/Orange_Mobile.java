import java.util.Scanner;


public class Orange_Mobile implements Orange,Provider{
	private Scanner in  = new Scanner(System.in);
	private int amount;
	public void orange_MobileFrom()
	{
		System.out.print("--Hello in Orange Mobile Recharge--");
		System.out.print("Please Enter your phone number: ");
		String phone=in.next();
		System.out.print("Please Enter The value of the balance that you want to charge: ");
		amount=in.nextInt();

		
	}
	public void providerForm()
	{
		orange_MobileFrom();
	}
	public int getAmount()
	{
		return amount;
	}
	
}
