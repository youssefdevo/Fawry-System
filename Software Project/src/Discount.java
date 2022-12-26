
public abstract class Discount {
	public double discount_amount = 0;

	public abstract void setDiscount(double value);
	public abstract double getDiscount_amount();
	public abstract double applyDiscount();
	//public void wrapDiscount(Discount d);
	protected abstract void wrapDiscount(Discount discount);
}
