import java.util.ArrayList;

public class User {
	
	private Account myAccount;
	private int overall_discount;
	private Wallet wallet;
	private static ArrayList<Transaction> transactions;
	
	User(Account acc){
		this.setAccount(acc);
		
	}
	
	public Account getAccount() {
		return myAccount;
	}
	public void setAccount(Account myAcc) {
		this.myAccount = myAcc;
	}
	public int getOverall_discount() {
		return overall_discount;
	}
	public void setOverall_discount(int overall_discount) {
		this.overall_discount = overall_discount;
	}
	public void chargeMyWallet(CreditCard card,double amount){
		wallet.chargingWallet(card, amount);
	}
	public static ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public static void setTransactions(ArrayList<Transaction> transactions) {
		User.transactions = transactions;
	}
	public void addTransaction(Transaction trans) {
		transactions.add(trans);
	}

	
}
