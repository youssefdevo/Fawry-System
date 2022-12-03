import java.util.Scanner;

public class Donation implements Service {
	private Scanner in  = new Scanner(System.in);
	private Provider provider ;
	public void mobileRecharageForm()
	{
		System.out.println("1- Schools.\n 2- NGOs. \n 3- Hospitals.");
		int request = in.nextInt();
		if(request==1)
		{
			provider=new We_Mobile();
			provider.schoolForm();
		}
		else if(request==2)
		{
			provider=new Etisalat_Mobile();
			provider.NGOForm();
		}
		else if(request==3)
		{
			provider=new Orange_Mobile();
			provider.hospitalsForm();
		}
	
		
	}
}
