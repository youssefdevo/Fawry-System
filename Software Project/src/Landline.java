import java.util.Scanner;

public class Landline implements Service {
	private String name;
	private Scanner in  = new Scanner(System.in);
	private LandlineReceipt   receipt;
	Landline()
	{
		name="Landline";
	}
	public void landlineForm()
	{
		System.out.println("1- Monthly receipt.\n2- Quarter receipt.");
		int request = in.nextInt();
		if(request==1)
		{
			receipt = new MonthlyReceipt();
			receipt.landLineReceiptForm();
		}
		else if(request==2)
		{
			receipt = new QuarterReceipt();
			receipt.landLineReceiptForm();

		}
		
	}
	public void serviceForm()
	{
		landlineForm();
	}
	
	public double getAmount() {
		return receipt.getAmount();
	}
	@Override
	public Discount getDiscount() {
		// TODO Auto-generated method stub
		return receipt.getDiscount();
	}
	@Override
	public void updateDiscount(Discount discount) {
		receipt.setDiscount(discount);
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
