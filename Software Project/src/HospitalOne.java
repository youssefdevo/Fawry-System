import java.util.Scanner;


public class HospitalOne implements Hospital,DonationPlace {
	private Scanner in = new Scanner(System.in);
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
		int amount = in.nextInt();
		System.out.println("Thanks for your Donation.");

		
	}

}
