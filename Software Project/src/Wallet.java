
public class Wallet implements Payment {
	private CreditCard creditcard;
	private double balance;
	Wallet(){
		balance = 0;
	}
	public void pay() {
			// TODO Auto-generated method stub
		
	}
	public void chargingWallet(CreditCard card,double amount){
		this.creditcard = card;
		balance+=amount;
	}

}
