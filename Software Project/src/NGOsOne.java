import java.util.Scanner;


public class NGOsOne implements NGOs,DonationPlace {
	private Scanner in = new Scanner(System.in);
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
		int amount = in.nextInt();
		System.out.println("Thanks for your Donation.");

		
	}

}
