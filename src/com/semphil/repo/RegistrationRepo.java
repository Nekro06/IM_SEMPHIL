package com.semphil.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import com.semphil.bean.*;

public class RegistrationRepo {
	
private DataSource dataSource;
	
	public RegistrationRepo(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public List<Registration> getAll() {
		List<Registration> registrationList = new ArrayList<>();
		
		try(Connection connection = dataSource.getConnection();
			Statement retrieveStatement = connection.createStatement();
			ResultSet registrationResultSet = retrieveStatement.executeQuery("SELECT * FROM registration LEFT JOIN department ON department.dept_id = registration.dept_id" + 
					" LEFT JOIN vendor ON vendor.company_id = registration.company_id LEFT JOIN payment ON payment.payment_id = registration.payment_id" +
					" LEFT JOIN bank ON bank.region_bank_code = payment.region_bank_code")) {
			
			while(registrationResultSet.next()) {
				// Create objects where this repository is dependent
				Department department = null;
				Payment payment = null;
				Vendor vendor = null;
				Bank bank = null;
				
				// Data Entries of the Registration (including FK Columns)
				String 	registration_code = registrationResultSet.getString(1),
						dept_id = registrationResultSet.getString(2),
						company_id = registrationResultSet.getString(3),
						product_services = registrationResultSet.getString(4),
						registration_purpose = registrationResultSet.getString(5),
						registration_date = registrationResultSet.getString(6),
						contact_person = registrationResultSet.getString(7),		
						contact_number = registrationResultSet.getString(8),
						email_address = registrationResultSet.getString(9),
						payment_id = registrationResultSet.getString(10),	
						order_currency = registrationResultSet.getString(11),
						incoterms = registrationResultSet.getString(12),
						port_of_lading = registrationResultSet.getString(13);	
				
				// Data Entries of object Department (columns of Department)
				 		dept_id = registrationResultSet.getString(14);
				 String	requesting_dept = registrationResultSet.getString(15);
				
				// Data Entries of object Vendor (columns of Vendor)
				 		company_id = registrationResultSet.getString(16);
				 String	company_name = registrationResultSet.getString(17),
						location_street = registrationResultSet.getString(18),
						location_city = registrationResultSet.getString(19),
						location_district = registrationResultSet.getString(20),
						location_country = registrationResultSet.getString(21),
						postal_code = registrationResultSet.getString(22),
						telephone_number = registrationResultSet.getString(23),
						fax_number = registrationResultSet.getString(24),
						business_reg_number = registrationResultSet.getString(25);
				 
				// Data Entries of object Payment (columns of Payment)
				 		payment_id = registrationResultSet.getString(26);
			 			company_id = registrationResultSet.getString(27);
			 	String	payment_code = registrationResultSet.getString(28),
			 			region_bank_code = registrationResultSet.getString(29),
						account_number = registrationResultSet.getString(30);
			 	
			 	// Data Entries of object Bank (columns of Bank)
			 			region_bank_code = registrationResultSet.getString(31);
			 	String	bank_name = registrationResultSet.getString(32),
			 			swift_code = registrationResultSet.getString(33);
		
				// Pass the variables as arguments to the constructors
				department = new Department (dept_id, requesting_dept);
				vendor = new Vendor (company_id, company_name, location_street, location_city, location_district, 
						location_country, postal_code, telephone_number, fax_number, business_reg_number);
				bank = new Bank (region_bank_code, bank_name, swift_code);
				payment = new Payment (payment_id, vendor, payment_code, bank, account_number);
				
				Registration registration = new Registration (registration_code, department, vendor, product_services,
						 registration_purpose, registration_date, contact_person, contact_number,
						 email_address, payment, order_currency, incoterms, port_of_lading);
				
				// Add the object into the array list
				registrationList.add(registration);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		// Return the final list.
		return registrationList;
	}
	
	public Registration getByRegistrationCode(String registration_code) {
		Registration registration = null;
		Department department = null;
		Payment payment = null;
		Vendor vendor = null;
		Bank bank = null;
		
		try(Connection connection = dataSource.getConnection();
			Statement retrieveStatement = connection.createStatement();
			ResultSet registrationResultSet = retrieveStatement.executeQuery("SELECT * FROM registration LEFT JOIN department ON department.dept_id = registration.dept_id" + 
					" LEFT JOIN vendor ON vendor.company_id = registration.company_id LEFT JOIN payment ON payment.payment_id = registration.payment_id" +
					" LEFT JOIN bank ON bank.region_bank_code = payment.region_bank_code WHERE registration_code = \'" + registration_code + "\'")) {
			
			if(registrationResultSet.next()) {
				// Data Entries of the Registration (including FK Columns)
				String	dept_id = registrationResultSet.getString(2),
						company_id = registrationResultSet.getString(3),
						product_services = registrationResultSet.getString(4),
						registration_purpose = registrationResultSet.getString(5),
						registration_date = registrationResultSet.getString(6),
						contact_person = registrationResultSet.getString(7),		
						contact_number = registrationResultSet.getString(8),
						email_address = registrationResultSet.getString(9),
						payment_id = registrationResultSet.getString(10),	
						order_currency = registrationResultSet.getString(11),
						incoterms = registrationResultSet.getString(12),
						port_of_lading = registrationResultSet.getString(13);	
				
				// Data Entries of object Department (columns of Department)
				 		dept_id = registrationResultSet.getString(14);
				 String	requesting_dept = registrationResultSet.getString(15);
				
				// Data Entries of object Vendor (columns of Vendor)
				 		company_id = registrationResultSet.getString(16);
				 String	company_name = registrationResultSet.getString(17),
						location_street = registrationResultSet.getString(18),
						location_city = registrationResultSet.getString(19),
						location_district = registrationResultSet.getString(20),
						location_country = registrationResultSet.getString(21),
						postal_code = registrationResultSet.getString(22),
						telephone_number = registrationResultSet.getString(23),
						fax_number = registrationResultSet.getString(24),
						business_reg_number = registrationResultSet.getString(25);
				 
				// Data Entries of object Payment (columns of Payment)
				 		payment_id = registrationResultSet.getString(26);
			 			company_id = registrationResultSet.getString(27);
			 	String	payment_code = registrationResultSet.getString(28),
			 			region_bank_code = registrationResultSet.getString(29),
						account_number = registrationResultSet.getString(30);
			 	
			 	// Data Entries of object Bank (columns of Bank)
			 			region_bank_code = registrationResultSet.getString(31);
			 	String	bank_name = registrationResultSet.getString(32),
			 			swift_code = registrationResultSet.getString(33);
		
				// Pass the variables as arguments to the constructors
				department = new Department (dept_id, requesting_dept);
				vendor = new Vendor (company_id, company_name, location_street, location_city, location_district, 
						location_country, postal_code, telephone_number, fax_number, business_reg_number);
				bank = new Bank (region_bank_code, bank_name, swift_code);
				payment = new Payment (payment_id, vendor, payment_code, bank, account_number);
				
				registration = new Registration (registration_code, department, vendor, product_services,
						 registration_purpose, registration_date, contact_person, contact_number,
						 email_address, payment, order_currency, incoterms, port_of_lading);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		// Return the final list.
		return registration;
	}
	
	public void addRegistration (Registration registration) {
		try(
			Connection connection = dataSource.getConnection();
			PreparedStatement insertStatement =
					connection.prepareStatement("INSERT INTO registration VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
		
			insertStatement.setString(1, registration.getRegistration_code());
			insertStatement.setString(2, registration.getDepartment().getDept_id());
			insertStatement.setString(3, registration.getVendor().getCompany_id());
			insertStatement.setString(4, registration.getProduct_services());
			insertStatement.setString(5, registration.getRegistration_purpose());
			insertStatement.setString(6, registration.getRegistration_date());
			insertStatement.setString(7, registration.getContact_person());
			insertStatement.setString(8, registration.getContact_number());
			insertStatement.setString(9, registration.getEmail_address());
			insertStatement.setString(10, registration.getPayment().getPayment_id());
			insertStatement.setString(11, registration.getOrder_currency());
			insertStatement.setString(12, registration.getIncoterms());
			insertStatement.setString(13, registration.getPort_of_lading());
			
			insertStatement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
