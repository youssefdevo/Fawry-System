import java.util.Scanner;


public class QuarterReceipt implements LandlineReceipt {
	private Scanner in = new Scanner(System.in);
	private double amount;
	private Discount discount;
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
	@Override
	public void setDiscount(Discount discount) {
		this.discount=discount;
	}
	@Override
	public Discount getDiscount() {
		return discount;
	}
}
