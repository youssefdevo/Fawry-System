
public abstract class Payment {
	private Service service;
	private Discount discount;
	Payment(){}
	Payment(Service s)
	{
		this.service=s;
	}
	public abstract void pay(double amount);
	public double price()
	{
		double dis=service.getAmount()*discount.applyDiscount();
		double total =service.getAmount()-dis;
		return total;
	}
	
}
