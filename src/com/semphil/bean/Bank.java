package com.semphil.bean;

public class Bank {
	
	private String region_bank_code;
	private String bank_name;
	private String swift_code;
	
	public Bank(String region_bank_code, String bank_name, String swift_code) {
		super();
		this.region_bank_code = region_bank_code;
		this.bank_name = bank_name;
		this.swift_code = swift_code;
	}
	
	public Bank(String bank_name, String swift_code) {
		super();
		this.bank_name = bank_name;
		this.swift_code = swift_code;
	}

	public String getRegion_bank_code() {
		return region_bank_code;
	}
	
	public void setRegion_bank_code(String region_bank_code) {
		this.region_bank_code = region_bank_code;
	}
	
	public String getBank_name() {
		return bank_name;
	}
	
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
	public String getSwift_code() {
		return swift_code;
	}
	
	public void setSwift_code(String swift_code) {
		this.swift_code = swift_code;
	}

}
