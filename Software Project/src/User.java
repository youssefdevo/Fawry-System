import java.util.ArrayList;

import com.fci.advanced.se.fawryservice.payment.Wallet;

public class User {
	
	private Account myAccount;
	private Discount overall_discount;
	private  Wallet wallet;
	private static ArrayList<Transaction> transactions;
	
	
	User(Account acc){
		this.setAccount(acc);
		transactions = new ArrayList<>();
		wallet  =  new Wallet();
		this.overall_discount = new OverAll();
	}
	
	public Account getAccount() {
		return myAccount;
	}
	public void setAccount(Account myAcc) {
		this.myAccount = myAcc;
	}
	public Discount getOverall_discount() {
		return overall_discount;
	}
	public void updateDiscount(Discount overall_discount) {
		this.overall_discount = overall_discount;
	}
	public void chargeMyWallet(double amount){
		wallet.chargingWallet(amount);
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public static void setTransactions(ArrayList<Transaction> transactions) {
		User.transactions = transactions;
	}
	public void addTransaction(Transaction trans) {
		transactions.add(trans);
	}

	public Wallet getWallet() {
		return wallet;
	}
}
