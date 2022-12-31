package com.fci.advanced.se.fawryservice.entities;
import com.fci.advanced.se.fawryservice.controllers.FawrySystem;

//Refund Class.
public class Refund {
	//id of this refund to be easy to get it by index. 
	private int id;
	//transaction that user want to refund it.
	private Transaction trans;
	//state  = pending if admin doesn't accept or reject it yet, accepted if admin accepted it.
	private String state;
	//constructor
	public Refund(Transaction t){
		state = "Pending";
		this.trans = t;
		setId(FawrySystem.refundID++);
	}
	//setters and getters.
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
