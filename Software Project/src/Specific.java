
public class Specific implements Discount{
	//Discount discount;
	public int discount_amount=0;
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
		return discount_amount;
	}

}
