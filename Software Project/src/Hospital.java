
public class  Hospital implements DonationPlace {
	 private double amount;
	    public String donationForm(double amount)
	    {
	        return  HospitalsForm( amount );
	    }
	    public String HospitalsForm(double amount)
	    {
	    	this.amount=amount;
	        return  "Thanks for your Donation for Hospitals.";
	    }
	    
	    public double getAmount() {
	        return amount;
	    }

}
