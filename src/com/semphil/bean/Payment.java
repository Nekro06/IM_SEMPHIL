package com.semphil.bean;

public class Payment {
	
	private String payment_id;
	private String company_id; // For Add Form purposes
	private Vendor vendor; //company_id
	private String payment_code;
	private String region_bank_code; // For Add Form Purposes
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
	
	public Payment(String payment_id, String company_id, String payment_code, String region_bank_code, String account_number) {
		super();
		this.payment_id = payment_id;
		this.company_id = company_id;
		this.payment_code = payment_code;
		this.region_bank_code = region_bank_code;
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

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getRegion_bank_code() {
		return region_bank_code;
	}

	public void setRegion_bank_code(String region_bank_code) {
		this.region_bank_code = region_bank_code;
	}
	
}
