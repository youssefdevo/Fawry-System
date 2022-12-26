import java.util.Scanner;


public class InternetPayment implements Service {
	private String name;
	private Scanner in  = new Scanner(System.in);
	private Provider provider ;
	private double amount;
	private Discount discount;
	InternetPayment()
	{
		name="InternetPayment";
	}
	public String internetForm(double amount,String request )
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
	public String  serviceForm(double amount,String request)
	{
		 return internetForm(amount,request);
	}
	@Override
	public double getAmount() {
		return provider.getAmount();
	}
	@Override
	public Discount getDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}
	@Override
	public void updateDiscount(Discount discount) {
		this.discount=discount;
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
