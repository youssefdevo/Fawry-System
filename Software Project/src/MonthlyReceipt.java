import java.util.Scanner;


public class MonthlyReceipt implements LandlineReceipt {
	private Scanner in = new Scanner(System.in);
	public void monthlyReceoptForm()
	{
		System.out.println("you have pay for monthly rececpit :");
		int amount=in.nextInt();
		System.out.println("Successfully");

		
	}
	public void landLineReceiptForm()
	{
		monthlyReceoptForm();
	}


}
