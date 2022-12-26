
public class NGOs implements DonationPlace{

	  private double amount;
	    public String donationForm(double amount)
	    {
	        return  NGOsForm( amount );
	    }
	    public String NGOsForm(double amount)
	    {
	    	this.amount=amount;
	        return  "Thanks for your Donation for NGOs.";
	    }
	    
	    public double getAmount() {
	        return amount;
	    }
}
