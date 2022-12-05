import java.util.Scanner;

public class Donation implements Service {
	private String name;
	private Scanner in  = new Scanner(System.in);
	private DonationPlace place;
	Donation ()
	{
		name="Donation";
	}
	public void donationForm()
	{
		System.out.println("1- Schools.\n 2- NGOs. \n 3- Hospitals.");
		int request = in.nextInt();
		if(request==1)
		{
			
			System.out.println("1- School one");
			int request2 = in.nextInt();
			if(request2==1) {
				place= new SchoolOne(); 
			}
			place.donationForm();
		}
		else if(request==2)
		{
			System.out.println("1- NGOs one");
			int request2 = in.nextInt();
			if(request2==1) {
				place= new NGOsOne(); 
			}
			place.donationForm();
		}
		else if(request==3)
		{
			System.out.println("1- Hospital one");
			int request2 = in.nextInt();
			if(request2==1) {
				place= new HospitalOne(); 
			}
			place.donationForm();
		}
		else {
			donationForm();
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
	@Override
	public Discount getDiscount() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDiscount(Discount discount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
