import java.util.Scanner;


public class InternetPayment implements Service {
	private String name;
	private Scanner in  = new Scanner(System.in);
	private Provider provider ;
	private Discount discount;
	InternetPayment()
	{
		name="InternetPayment";
	}
	public void internetForm()
	{
		System.out.println("1-WE.\n 2-Etisalat. \n 3-Orange. \n 4-Vodafone");
		int request = in.nextInt();
		if(request==1)
		{
			provider=new We_Internet();
			provider.providerForm();
		}
		else if(request==2)
		{
			provider=new Etisalat_Internet();
			provider.providerForm();
		}
		else if(request==3)
		{
			provider=new Orange_Internet();
			provider.providerForm();
		}
		else if(request==4)
		{
			provider=new Vodafone_Internet();
			provider.providerForm();
		}
		
	}
	public void serviceForm()
	{
		internetForm();
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
	public void setDiscount(Discount discount) {
		this.discount=discount;
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
