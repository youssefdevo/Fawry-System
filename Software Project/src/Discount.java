
public abstract class Discount {
	public int discount_amount = 0;

	public abstract void setDiscount(int dis);
	public abstract int getDiscount_amount();
	public abstract double applyDiscount();
	//public void wrapDiscount(Discount d);
	protected abstract void wrapDiscount(Discount discount);
}
