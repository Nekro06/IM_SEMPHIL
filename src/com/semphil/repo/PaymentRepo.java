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

public class PaymentRepo {
	
private DataSource dataSource;
	
	public PaymentRepo(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void addPayment (Payment payment) {
		try(
			Connection connection = dataSource.getConnection();
			PreparedStatement insertStatement =
					connection.prepareStatement("INSERT INTO department VALUES (?, ?)")) {
			
			insertStatement.setString(1, payment.getPayment_id());
			insertStatement.setString(2, payment.getVendor().getCompany_id());
			insertStatement.setString(3, payment.getPayment_code());
			insertStatement.setString(4, payment.getBank().getRegion_bank_code());
			insertStatement.setString(5, payment.getAccount_number());
			
			insertStatement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
