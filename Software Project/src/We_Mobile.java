import java.util.Scanner;


public class We_Mobile implements  We,Provider{
	private Scanner in  = new Scanner(System.in);
	private int amount;
	public void we_MobileFrom()
	{
		System.out.print("--Hello in We Mobile Recharge--");
		System.out.print("Please Enter your phone number: ");
		String phone=in.next();
		System.out.print("Please Enter The value of the balance that you want to charge: ");
		amount=in.nextInt();

		
	}
	
	public void providerForm()
	{
		we_MobileFrom();
	}
	public int getAmount()
	{
		return amount;
	}
	
}
