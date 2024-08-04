package com.wp;

public class Buyers_Info {
	
	private int buyer_id;
	private String buyer_name;
	private double buyer_request_amount;
	
	
	public Buyers_Info(int buyer_id, String buyer_name, double buyer_request_amount) {
		this.buyer_id = buyer_id;
		this.buyer_name = buyer_name;
		this.buyer_request_amount = buyer_request_amount;
	}

	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getBuyer_name() {
		return buyer_name;
	}
	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}
	public double getBuyer_request_amount() {
		return buyer_request_amount;
	}
	public void setBuyer_request_amount(double buyer_request_amount) {
		this.buyer_request_amount = buyer_request_amount;
	}
	
	
}