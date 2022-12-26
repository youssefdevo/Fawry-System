import java.util.Scanner;


public class MobileRecharge implements Service {
	private String name;
	private Scanner in  = new Scanner(System.in);
	private Provider provider ;
	private double amount ;
	private Discount discount;
	MobileRecharge()
	{
		name="MobileRecharge";
		
		
	}
	public String mobileRecharageForm(double amount,String  request)
	{	 
		this.amount=amount;
	  request=request.toLowerCase();
		if(request=="we")
		{
			return "WE";
		}
		else if(request=="etisalat")
			
		{
			return "Etisalat";

		}
		else if(request=="orange")
		{			
			return "Orange";

		}
		else if(request=="vodafone")
		{
			return "Vodafone";

		}
		provider.providerForm();
		return "Not found";
		
		
	}
	
	public String   serviceForm(double amount  ,String request  )
	{
		 return mobileRecharageForm( amount ,  request);
	}
	
	public double getAmount() {
		return amount;
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
