
public class Refund {
	private Transaction trans;
	private String state;
	
	Refund(){
		state = "Pending";
	}
	public Transaction getTrans() {
		return trans;
	}
	
	public void setTrans(Transaction trans) {
		this.trans = trans;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
