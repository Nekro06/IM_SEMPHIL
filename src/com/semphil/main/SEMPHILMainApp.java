package com.semphil.main;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.semphil.repo.DepartmentRepo;
import com.semphil.ui.MainUI;

public class SEMPHILMainApp {

	public static void main(String[] args) {
		
		MysqlDataSource dataSource = new MysqlDataSource();
		
		// Declaration of All Repositories as Objects and Passing the "dataSource" as Argument to their Constructor
		DepartmentRepo departmentRepo = new DepartmentRepo(dataSource);
	}
}
