
public class School implements DonationPlace {
    private double amount;
    public String donationForm(double amount)
    {
        return  schoolForm( amount );
    }
    public String schoolForm(double amount)
    {
    	this.amount=amount;
      
        return  "Thanks for your Donation for Schools.";
    }
    
    public double getAmount() {
        return amount;
    }
	
}
