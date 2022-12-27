package com.fci.advanced.se.fawryservice.service;

public class OverAll extends Discount{
	
	Discount discount;
	public OverAll(){
		discount = new Specific();
	}
	OverAll(Discount d){
		this.discount = d;
	}
	public void setDiscount(double dis)
	{
		discount_amount = dis;
	}
	public double getDiscount_amount()
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
