
public class Wallet extends Payment {
	private CreditCard creditcard;
	private  double balance;
	
	Wallet()
	{
		balance=0;
	}
	Wallet(Service service, User currentUser) {
		super(service,currentUser);
	}
	public void pay(double amount) {
			
		 if(balance>=amount) {
			 System.out.println("Transaction completed successfully\n\n");
		 }
		 else {
			System.out.println("there is no enough money\n\n");
		 }
		
	}
	public void chargingWallet(double amount){
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
	public void addBalance(double b) {
		balance+=b;
	}

}
