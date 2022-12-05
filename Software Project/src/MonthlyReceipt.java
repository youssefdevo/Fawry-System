import java.util.Scanner;


public class MonthlyReceipt implements LandlineReceipt {
	private Scanner in = new Scanner(System.in);
	private double amount;
	public void monthlyReceoptForm()
	{
		System.out.println("you have pay for monthly rececpit :");
		amount=in.nextDouble();
		System.out.println("Successfully");

		
	}
	public void landLineReceiptForm()
	{
		monthlyReceoptForm();
	}
	public double getAmount()
	{
		return amount;
	}

}
