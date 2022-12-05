
public class OverAll extends Discount{
	
	Discount discount;
	OverAll(){
		discount = new Specific();
	}
	OverAll(Discount d){
		this.discount = d;
	}
	public void setDiscount(int dis)
	{
		discount_amount = dis;
	}
	public int getDiscount_amount()
	{
		return discount_amount;
	}
	public void wrapDiscount(Discount d) {
		this.discount = d;
	}
	
	public double applyDiscount() {
		double total_discount=discount_amount;
		if(discount!=null) {
			total_discount+=discount.applyDiscount();
		}
		return total_discount;
	}

	

}
