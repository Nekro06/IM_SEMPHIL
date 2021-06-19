package com.semphil.bean;

public class Registration {
	
	private String registration_code;
	private Department department; //dept_id
	private Vendor vendor; //company_id
	private String product_services;
	private String registration_purpose;
	private String registration_date;
	private String contact_person;
	private String contact_number;
	private String email_address;
	private Payment payment; //payment_id
	private String order_currency;
	private String incoterms;
	private String port_of_lading;
	
	public Registration(String registration_code, Department department, Vendor vendor, String product_services,
			String registration_purpose, String registration_date, String contact_person, String contact_number,
			String email_address, Payment payment, String order_currency, String incoterms, String port_of_lading) {
		super();
		this.registration_code = registration_code;
		this.department = department;
		this.vendor = vendor;
		this.product_services = product_services;
		this.registration_purpose = registration_purpose;
		this.registration_date = registration_date;
		this.contact_person = contact_person;
		this.contact_number = contact_number;
		this.email_address = email_address;
		this.payment = payment;
		this.order_currency = order_currency;
		this.incoterms = incoterms;
		this.port_of_lading = port_of_lading;
	}
	
	public Registration(Department department, Vendor vendor, String product_services,
			String registration_purpose, String registration_date, String contact_person, String contact_number,
			String email_address, Payment payment, String order_currency, String incoterms, String port_of_lading) {
		super();
		this.department = department;
		this.vendor = vendor;
		this.product_services = product_services;
		this.registration_purpose = registration_purpose;
		this.registration_date = registration_date;
		this.contact_person = contact_person;
		this.contact_number = contact_number;
		this.email_address = email_address;
		this.payment = payment;
		this.order_currency = order_currency;
		this.incoterms = incoterms;
		this.port_of_lading = port_of_lading;
	}

	public String getRegistration_code() {
		return registration_code;
	}
	
	public void setRegistration_code(String registration_code) {
		this.registration_code = registration_code;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public Vendor getVendor() {
		return vendor;
	}
	
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
	public String getProduct_services() {
		return product_services;
	}
	
	public void setProduct_services(String product_services) {
		this.product_services = product_services;
	}
	
	public String getRegistration_purpose() {
		return registration_purpose;
	}
	
	public void setRegistration_purpose(String registration_purpose) {
		this.registration_purpose = registration_purpose;
	}
	
	public String getRegistration_date() {
		return registration_date;
	}
	
	public void setRegistration_date(String registration_date) {
		this.registration_date = registration_date;
	}
	
	public String getContact_person() {
		return contact_person;
	}
	
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	
	public String getContact_number() {
		return contact_number;
	}
	
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	
	public String getEmail_address() {
		return email_address;
	}
	
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	
	public Payment getPayment() {
		return payment;
	}
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public String getOrder_currency() {
		return order_currency;
	}
	
	public void setOrder_currency(String order_currency) {
		this.order_currency = order_currency;
	}
	
	public String getIncoterms() {
		return incoterms;
	}
	
	public void setIncoterms(String incoterms) {
		this.incoterms = incoterms;
	}
	
	public String getPort_of_lading() {
		return port_of_lading;
	}
	
	public void setPort_of_lading(String port_of_lading) {
		this.port_of_lading = port_of_lading;
	}

}
