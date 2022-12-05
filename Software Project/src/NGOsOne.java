import java.util.Scanner;


public class NGOsOne implements NGOs,DonationPlace {
	private Scanner in = new Scanner(System.in);
	private double amount;
	public void donationForm()
	{
		NGOsForm();
	}
	public void NGOsForm()
	{
		NGOsOneForm();
	}
	public void NGOsOneForm()
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
