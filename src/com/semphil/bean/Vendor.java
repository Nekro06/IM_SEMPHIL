package com.semphil.bean;

public class Vendor {
	
	private String company_id;
	private String company_name;
	private String location_street;
	private String location_city;
	private String location_district;
	private String location_country;
	private String postal_code;
	private String telephone_number;
	private String fax_number;
	private String business_reg_number;
	
	
	public Vendor(String company_id, String company_name, String location_street, String location_city,
			String location_district, String location_country, String postal_code, String telephone_number,
			String fax_number, String business_reg_number) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.location_street = location_street;
		this.location_city = location_city;
		this.location_district = location_district;
		this.location_country = location_country;
		this.postal_code = postal_code;
		this.telephone_number = telephone_number;
		this.fax_number = fax_number;
		this.business_reg_number = business_reg_number;
	}
	
	public Vendor(String company_name, String location_street, String location_city,
			String location_district, String location_country, String postal_code, String telephone_number,
			String fax_number, String business_reg_number) {
		super();
		this.company_name = company_name;
		this.location_street = location_street;
		this.location_city = location_city;
		this.location_district = location_district;
		this.location_country = location_country;
		this.postal_code = postal_code;
		this.telephone_number = telephone_number;
		this.fax_number = fax_number;
		this.business_reg_number = business_reg_number;
	}

	public String getCompany_id() {
		return company_id;
	}
	
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	
	public String getCompany_name() {
		return company_name;
	}
	
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	
	public String getLocation_street() {
		return location_street;
	}
	
	public void setLocation_street(String location_street) {
		this.location_street = location_street;
	}
	
	public String getLocation_city() {
		return location_city;
	}
	
	public void setLocation_city(String location_city) {
		this.location_city = location_city;
	}
	
	public String getLocation_district() {
		return location_district;
	}
	
	public void setLocation_district(String location_district) {
		this.location_district = location_district;
	}
	
	public String getLocation_country() {
		return location_country;
	}
	
	public void setLocation_country(String location_country) {
		this.location_country = location_country;
	}
	
	public String getPostal_code() {
		return postal_code;
	}
	
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	public String getTelephone_number() {
		return telephone_number;
	}
	
	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}
	
	public String getFax_number() {
		return fax_number;
	}
	
	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}
	
	public String getBusiness_reg_number() {
		return business_reg_number;
	}
	
	public void setBusiness_reg_number(String business_reg_number) {
		this.business_reg_number = business_reg_number;
	}

}
