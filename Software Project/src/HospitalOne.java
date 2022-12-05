import java.util.Scanner;


public class HospitalOne implements Hospital,DonationPlace {
	private Scanner in = new Scanner(System.in);
	double amount;
	public void donationForm()
	{
		hospitalForm();
	}
	public void hospitalForm()
	{
		hospitalOneForm();
	}
	public void hospitalOneForm()
	{
		System.out.println("Place Enter amount of Donation :");
		amount = in.nextDouble();
		System.out.println("Thanks for your Donation.");	
	}
	@Override
	public double getAmount() {
		return amount;
	}

}
