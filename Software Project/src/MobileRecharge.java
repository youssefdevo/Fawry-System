import java.util.Scanner;


public class MobileRecharge implements Service {
	private String name;
	private Scanner in  = new Scanner(System.in);
	private Provider provider ;
	private Discount discount;
	MobileRecharge()
	{
		name="MobileRecharge";
	}
	public void mobileRecharageForm()
	{
		System.out.println("1-WE.\n 2-Etisalat. \n 3-Orange. \n 4-Vodafone");
		int request = in.nextInt();
		if(request==1)
		{
			provider=new We_Mobile();
			provider.providerForm();
		}
		else if(request==2)
		{
			provider=new Etisalat_Mobile();
			provider.providerForm();
		}
		else if(request==3)
		{
			provider=new Orange_Mobile();
			provider.providerForm();
		}
		else if(request==4)
		{
			provider=new Vodafone_Mobile();
			provider.providerForm();
		}
		
	}
	public void serviceForm()
	{
		mobileRecharageForm();
	}
	
	public double getAmount() {
		return provider.getAmount();
	}
	public Discount getDiscount() {
		return discount;
	}
	public void updateDiscount(Discount discount) {
		this.discount = discount;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
}
