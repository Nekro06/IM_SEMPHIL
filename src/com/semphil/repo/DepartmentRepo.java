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

public class DepartmentRepo {

	private DataSource dataSource;
	
	public DepartmentRepo(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void addDepartment (Department department) {
		try(
			Connection connection = dataSource.getConnection();
			PreparedStatement insertStatement =
					connection.prepareStatement("INSERT INTO department VALUES (?, ?)")) {
			
			// Use the accessors from the bean to retrieve the data
			insertStatement.setString(1, department.getDept_id());
			insertStatement.setString(2, department.getRequesting_dept());
			
			insertStatement.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
