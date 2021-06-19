package com.semphil.bean;

public class Payment {
	
	private String payment_id;
	private Vendor vendor; //company_id
	private String payment_code;
	private Bank bank; //regioon_bank_code
	private String account_number;
	
	public Payment(String payment_id, Vendor vendor, String payment_code, Bank bank, String account_number) {
		super();
		this.payment_id = payment_id;
		this.vendor = vendor;
		this.payment_code = payment_code;
		this.bank = bank;
		this.account_number = account_number;
	}
	
	public Payment(Vendor vendor, String payment_code, Bank bank, String account_number) {
		super();
		this.vendor = vendor;
		this.payment_code = payment_code;
		this.bank = bank;
		this.account_number = account_number;
	}

	public String getPayment_id() {
		return payment_id;
	}
	
	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	
	public Vendor getVendor() {
		return vendor;
	}
	
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	public String getPayment_code() {
		return payment_code;
	}
	
	public void setPayment_code(String payment_code) {
		this.payment_code = payment_code;
	}
	
	public Bank getBank() {
		return bank;
	}
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	public String getAccount_number() {
		return account_number;
	}
	
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	
}
