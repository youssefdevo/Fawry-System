import java.util.Scanner;

public class Donation implements Service {
	private Scanner in  = new Scanner(System.in);
	private DonationPlace place;
	public void donationForm()
	{
		System.out.println("1- Schools.\n 2- NGOs. \n 3- Hospitals.");
		int request = in.nextInt();
		if(request==1)
		{
			School s = null;
			place=(DonationPlace)s;
			place.donationForm();
		}
		else if(request==2)
		{
			NGOs n = null;
			place=(DonationPlace)n;
			place.donationForm();
		}
		else if(request==3)
		{
			Hospital h = null;
			place=(DonationPlace)h;
			place.donationForm();
		}
	}
	public void serviceForm()
	{
		donationForm();
	}
	@Override
	public double getAmount() {
		return place.getAmount();
	}
}
