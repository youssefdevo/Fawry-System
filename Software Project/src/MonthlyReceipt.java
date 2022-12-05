import java.util.Scanner;


public class MonthlyReceipt implements LandlineReceipt {
	private Scanner in = new Scanner(System.in);
	private Discount discount;
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
	public void setDiscount(Discount discount) {
		this.discount=discount;
	}
	@Override
	public Discount getDiscount() {
		return discount;
	}

}
