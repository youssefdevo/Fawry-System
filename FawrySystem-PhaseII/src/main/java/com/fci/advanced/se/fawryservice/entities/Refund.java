package com.fci.advanced.se.fawryservice.entities;
import com.fci.advanced.se.fawryservice.controllers.FawrySystem;


public class Refund {
	private int id;
	private Transaction trans;
	private String state;
	
	public Refund(Transaction t){
		state = "Pending";
		this.trans = t;
		setId(FawrySystem.refundID++);
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
