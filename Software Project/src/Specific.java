
public class Specific implements Discount{
	//Discount discount;
	public double discount_amount=0.0;
	public void setDiscount(double dis)
	{
		discount_amount=dis;
	}
	public double getDiscount_amount()
	{
		return discount_amount;
	}
	public double applyDiscount()
	{
		return discount_amount;
	}

}
