package com.semphil.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

public class DepartmentRepo {

	private DataSource dataSource;
	
	public DepartmentRepo(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
