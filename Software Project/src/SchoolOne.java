import java.util.Scanner;


public class SchoolOne implements School, DonationPlace {
	private Scanner in = new Scanner(System.in);
	private double amount;
	public void donationForm()
	{
		schoolForm();
	}
	public void schoolForm()
	{
		schoolOneForm();
	}
	public void schoolOneForm()
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

