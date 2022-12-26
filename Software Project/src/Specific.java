
public class Specific extends Discount{
	//Discount discount;

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
		return getDiscount_amount();
	}
	@Override
	protected void wrapDiscount(Discount discount) {
		
	}

}
