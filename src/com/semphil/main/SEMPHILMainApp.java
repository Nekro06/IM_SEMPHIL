package com.semphil.main;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.semphil.repo.DepartmentRepo;
import com.semphil.ui.MainUI;

public class SEMPHILMainApp {

	public static void main(String[] args) {
		
		MysqlDataSource dataSource = new MysqlDataSource();
		
		// Declaration of All Repositories as Objects and Passing the "dataSource" as Argument to their Constructor
		DepartmentRepo departmentRepo = new DepartmentRepo(dataSource);
		//VendorRepo vendorRepo = new VendorRepo(dataSource);
		// INSERT OTHER REPOS HERE
		
		// Declaration of Management Panel as Objects and Wiring them with their Respective Repositories
		com.semphil.ui.InputMgmtPanel inputMgmtPanel =
				new com.semphil.ui.InputMgmtPanel();
		inputMgmtPanel.setDepartmentRepo(departmentRepo);
		//inputMgmtPanel.setVendorRepo(vendorRepo);
		// INSERT OTHER REPOS HERE
		
		// Declaration of the Main User Interface (UI) and Linking the Management Panel to the Main UI
		MainUI mainUI = new MainUI();
		mainUI.setVisible(true);
		mainUI.setInputMgmtPanel(inputMgmtPanel);
	}
}
