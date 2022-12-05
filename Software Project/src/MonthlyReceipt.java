import java.util.Scanner;


public class MonthlyReceipt implements LandlineReceipt {
	private Scanner in = new Scanner(System.in);
	private int amount;
	public void monthlyReceoptForm()
	{
		System.out.println("you have pay for monthly rececpit :");
		amount=in.nextInt();
		System.out.println("Successfully");

		
	}
	public void landLineReceiptForm()
	{
		monthlyReceoptForm();
	}
	public int getAmount()
	{
		return amount;
	}

}
