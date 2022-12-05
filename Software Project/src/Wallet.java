
public class Wallet extends Payment {
	private CreditCard creditcard;
	private double balance;
	Wallet(Service s)
	{
		super(s);
		balance=0;
	}
	public void pay(double amount) {
			
		 if(balance>=amount) {
			 System.out.println("Transaction completed successfully");
		 }
		 else {
			System.out.println("there is no enough money");
		 }
		
	}
	public void chargingWallet(CreditCard card,double amount){
		this.setCreditcard(card);
		setBalance(getBalance() + amount);
	}
	public CreditCard getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(CreditCard creditcard) {
		this.creditcard = creditcard;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
