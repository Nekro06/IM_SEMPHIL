package com.semphil.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.semphil.bean.Bank;

public class BankRepo {
	
private DataSource dataSource;
	
	public BankRepo (DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void addBank (Bank bank) {
		try(
			Connection connection = dataSource.getConnection();
			PreparedStatement insertStatement =
					connection.prepareStatement("INSERT INTO bank VALUES (?, ?, ?)")) {
			
			insertStatement.setString(1, bank.getRegion_bank_code());
			insertStatement.setString(2, bank.getBank_name());
			insertStatement.setString(3, bank.getSwift_code());
			
			insertStatement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
