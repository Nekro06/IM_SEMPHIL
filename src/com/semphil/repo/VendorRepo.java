package com.semphil.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import com.semphil.bean.Department;
import com.semphil.bean.Vendor;

public class VendorRepo {
	
	private DataSource dataSource;
	
	public VendorRepo(DataSource dataSource) {
		
		this.dataSource = dataSource;
	}
	
	public void addVendor (Vendor vendor) {
		try(
			Connection connection = dataSource.getConnection();
			PreparedStatement insertStatement =
					connection.prepareStatement("INSERT IGNORE INTO vendor VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
			
			insertStatement.setString(1, vendor.getCompany_id());
			insertStatement.setString(2, vendor.getCompany_name());
			insertStatement.setString(3, vendor.getLocation_street());
			insertStatement.setString(4, vendor.getLocation_city());
			insertStatement.setString(5, vendor.getLocation_district());
			insertStatement.setString(6, vendor.getLocation_country());
			insertStatement.setString(7, vendor.getPostal_code());
			insertStatement.setString(8, vendor.getTelephone_number());
			insertStatement.setString(9, vendor.getFax_number());
			insertStatement.setString(10, vendor.getBusiness_reg_number());
			
			insertStatement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
