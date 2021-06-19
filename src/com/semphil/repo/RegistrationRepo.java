package com.semphil.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import com.semphil.bean.Payment;
import com.semphil.bean.Registration;

public class RegistrationRepo {
	
private DataSource dataSource;
	
	public RegistrationRepo(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void addRegistration (Registration registration) {
		try(
			Connection connection = dataSource.getConnection();
			PreparedStatement insertStatement =
					connection.prepareStatement("INSERT INTO department VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
		
			insertStatement.setString(1, registration.getRegistration_code());
			insertStatement.setString(2, registration.getDepartment().getDept_id());
			insertStatement.setString(3, registration.getVendor().getCompany_id());
			insertStatement.setString(4, registration.getProduct_services());
			insertStatement.setString(5, registration.getRegistration_purpose());
			insertStatement.setString(6, registration.getRegistration_date());
			insertStatement.setString(5, registration.getContact_person());
			insertStatement.setString(5, registration.getContact_number());
			insertStatement.setString(5, registration.getEmail_address());
			insertStatement.setString(5, registration.getPayment().getPayment_id());
			insertStatement.setString(5, registration.getOrder_currency());
			insertStatement.setString(5, registration.getIncoterms());
			insertStatement.setString(5, registration.getPort_of_lading());
			
			insertStatement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
