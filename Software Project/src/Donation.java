import java.util.Scanner;

public class Donation implements Service {
	private Scanner in  = new Scanner(System.in);
	private DonationPlace place;
	public void mobileRecharageForm()
	{
		System.out.println("1- Schools.\n 2- NGOs. \n 3- Hospitals.");
		int request = in.nextInt();
		if(request==1)
		{
			place=new School();
			place.schoolForm();
		}
		else if(request==2)
		{
			place=new NGOs();
			place.NGOForm();
		}
		else if(request==3)
		{
			place=new Hospital();
			place.hospitalsForm();
		}
	
		
	}
}
