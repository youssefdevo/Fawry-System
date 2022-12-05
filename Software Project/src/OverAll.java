
public class OverAll implements Discount{
	Discount discount;
	public int discount_amount = 0;
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
		double total_discount=discount_amount + discount.applyDiscount();
		return total_discount;
	}
	

}
