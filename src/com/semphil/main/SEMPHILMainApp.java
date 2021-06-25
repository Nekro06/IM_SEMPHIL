package com.semphil.main;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.semphil.repo.*;
import com.semphil.ui.MainUI;

public class SEMPHILMainApp {

	public static void main(String[] args) {
		
		MysqlDataSource dataSource = new MysqlDataSource();
		
		// Database Connection
		try {
			dataSource.setUrl("jdbc:mysql://localhost:3306/semphil");
			dataSource.setUser("root");
			dataSource.setPassword("Antonio010601");
		}catch(Exception objEx){
			JOptionPane.showMessageDialog(null, "Database Connection Unsuccessful", "ERROR!", JOptionPane.WARNING_MESSAGE);
			objEx.printStackTrace();
		}
		
		// Declaration of All Repositories as Objects and Passing the "dataSource" as Argument to their Constructor
		DepartmentRepo departmentRepo = new DepartmentRepo(dataSource);
		VendorRepo vendorRepo = new VendorRepo(dataSource);
		BankRepo bankRepo = new BankRepo(dataSource);
		PaymentRepo paymentRepo = new PaymentRepo(dataSource);
		RegistrationRepo registrationRepo = new RegistrationRepo(dataSource);
		// INSERT OTHER REPOS HERE
		
		// Declaration of Management Panel as Objects and Wiring them with their Respective Repositories
		com.semphil.ui.InputMgmtPanel inputMgmtPanel =
				new com.semphil.ui.InputMgmtPanel();
		
		inputMgmtPanel.setDepartmentRepo(departmentRepo);
		inputMgmtPanel.setVendorRepo(vendorRepo);
		inputMgmtPanel.setBankRepo(bankRepo);
		inputMgmtPanel.setPaymentRepo(paymentRepo);
		inputMgmtPanel.setRegistrationRepo(registrationRepo);
		// INSERT OTHER REPOS HERE
		
		// Declaration of the Main User Interface (UI) and Linking the Management Panel to the Main UI
		MainUI mainUI = new MainUI();
		mainUI.setVisible(true);
		mainUI.setInputMgmtPanel(inputMgmtPanel);
	}
}
