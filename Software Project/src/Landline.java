import java.util.Scanner;

public class Landline implements Service {
	private Scanner in  = new Scanner(System.in);
	private LandlineReceipt   receipt;
	public void landlineForm()
	{
		System.out.println("1- Monthly receipt.\n 2- Quarter receipt.");
		int request = in.nextInt();
		if(request==1)
		{
			receipt = new MonthlyReceipt();
		}
		else if(request==2)
		{
			receipt = new QuarterReceipt();
		}
		
	}
}
