import java.util.Scanner;


public class QuarterReceipt implements LandlineReceipt {
	private Scanner in = new Scanner(System.in);
	private double amount;
	public void quarterReceoptForm()
	{
		System.out.println("you have pay for monthly rececpit :");
		amount=in.nextInt();
		System.out.println("Successfully");

		
	}
	public void landLineReceiptForm()
	{
		quarterReceoptForm();
	}
	public double getAmount()
	{
		return amount;
	}
}
