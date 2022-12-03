import java.util.ArrayList;

public class User {
	
	private Account myAcc;
	private int overall_discount;
	private int wallet;
	private static ArrayList<Transaction> transactions;
	
	User(Account acc){
		this.setAccount(acc);
		
	}
	
	public Account getAccount() {
		return myAcc;
	}
	public void setAccount(Account myAcc) {
		this.myAcc = myAcc;
	}
	public int getOverall_discount() {
		return overall_discount;
	}
	public void setOverall_discount(int overall_discount) {
		this.overall_discount = overall_discount;
	}
	public int getWallet() {
		return wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public static ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public static void setTransactions(ArrayList<Transaction> transactions) {
		User.transactions = transactions;
	}
	
}
