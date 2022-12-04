import java.util.Scanner;


public class QuarterReceipt implements LandlineReceipt {
	private Scanner in = new Scanner(System.in);
	public void quarterReceoptForm()
	{
		System.out.println("you have pay for monthly rececpit :");
		int amount=in.nextInt();
		System.out.println("Successfully");

		
	}
	public void landLineReceiptForm()
	{
		quarterReceoptForm();
	}
}
