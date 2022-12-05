
public class Specific extends Discount{
	//Discount discount;

	public void setDiscount(int dis)
	{
		discount_amount=dis;
	}
	public int getDiscount_amount()
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
