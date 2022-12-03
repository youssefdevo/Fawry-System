import java.util.Scanner;


public class We_Internet extends We{
	private Scanner in  = new Scanner(System.in);
	public void we_InternetFrom()
	{
		System.out.print("--Hello in We Internet--");
		System.out.print("Please Enter your E-mail: ");
		String email=in.next();
		System.out.print("Please Enter Your Password: ");
		String password=in.next();
		System.out.print("Please Enter : ");
		int cost=in.nextInt();
	}
	
	public void providerForm()
	{
		we_InternetFrom();
	}
	
}