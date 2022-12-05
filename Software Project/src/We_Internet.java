import java.util.Scanner;


public class We_Internet implements  We,Provider{
	private Scanner in  = new Scanner(System.in);
	private int amount;
	public void we_InternetFrom()
	{
		System.out.print("--Hello in We Internet--");
		System.out.print("Please Enter your E-mail: ");
		String email=in.next();
		System.out.print("Please Enter Your Password: ");
		String password=in.next();
		System.out.print("Please Enter : ");
		amount=in.nextInt();
	}
	
	public void providerForm()
	{
		we_InternetFrom();
	}
	public int getAmount()
	{
		return amount;
	}
	
}