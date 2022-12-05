import java.util.Scanner;


public class SchoolOne implements School, DonationPlace {
	private Scanner in = new Scanner(System.in);
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
		int amount = in.nextInt();
		System.out.println("Thanks for your Donation.");

		
	}

}

