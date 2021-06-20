package com.semphil.ui;

/*
 *	Name of Class: InputMgmtPanel.java
 *		This is the class for the GUI of the Input Management Panel. 
 *		It contains the table where all data of entity "Registration" is shown.
 */

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.semphil.bean.*;
import com.semphil.repo.*;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class InputMgmtPanel extends JPanel {
	
	private JTable tblInput;
	protected InputAddForm inputAddForm;
	protected InputViewForm inputViewForm;
	protected InputTableModel inputTableModel;
	protected DepartmentRepo departmentRepo;
	protected VendorRepo vendorRepo;
	protected BankRepo bankRepo;
	protected RegistrationRepo registrationRepo;
	protected PaymentRepo paymentRepo;

	public InputMgmtPanel() {
		setMinimumSize(new Dimension(500, 500));
		setPreferredSize(new Dimension(1000, 550));
		setBackground(SystemColor.control);
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Linking the Add and View Form Dialogs to this Management Panel
		inputAddForm = new InputAddForm();
		inputAddForm.inputMgmtPanel = this;
		inputViewForm = new InputViewForm();
		inputViewForm.inputMgmtPanel = this;
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setAlignmentY(Component.TOP_ALIGNMENT);
		pnlHeader.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnlHeader.setPreferredSize(new Dimension(1000, 50));
		pnlHeader.setMaximumSize(new Dimension(1000, 1000));
		pnlHeader.setBorder(new EmptyBorder(2, 2, 2, 2));
		pnlHeader.setBackground(SystemColor.control);
		add(pnlHeader);
		pnlHeader.setLayout(new BoxLayout(pnlHeader, BoxLayout.X_AXIS));
		
		JLabel lblHeader = new JLabel("REGISTRATION MANAGEMENT PANEL");
		pnlHeader.add(lblHeader);
		lblHeader.setFont(new Font("Helvetica LT Std Cond", Font.BOLD, 30));
		
		JPanel pnlBtns = new JPanel();
		pnlHeader.add(pnlBtns);
		pnlBtns.setBackground(SystemColor.control);
		pnlBtns.setBorder(new EmptyBorder(0, 0, 0, 0));
		pnlBtns.setMaximumSize(new Dimension(700, 700));
		pnlBtns.setPreferredSize(new Dimension(500, 50));
		
		JButton btnView = new JButton("VIEW FORM");
		btnView.setMinimumSize(new Dimension(150, 25));
		btnView.setMinimumSize(new Dimension(100, 35));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int rowIndex = tblInput.getSelectedRow();
				
				if(rowIndex == -1) {
					JOptionPane.showMessageDialog(null, "Please select a registration!", "WARNING!", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				String registration_code = (String) inputTableModel.getValueAt(rowIndex, 0);
				Registration registration = registrationRepo.getByRegistrationCode(registration_code);
				
				//inputViewForm.viewDataInDialog(registration);
				inputViewForm.setVisible(true);
			}
		});
		btnView.setPreferredSize(new Dimension(150, 35));
		btnView.setMaximumSize(new Dimension(150, 35));
		btnView.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		pnlBtns.add(btnView);
		
		JButton btnAdd = new JButton("NEW FORM");
		btnAdd.setMinimumSize(new Dimension(150, 35));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				inputAddForm.setVisible(true);
			}
		});
		btnAdd.setPreferredSize(new Dimension(150, 35));
		btnAdd.setMaximumSize(new Dimension(150, 35));
		btnAdd.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		pnlBtns.add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
		// Linking the JTable to this Management Panel
		tblInput = new JTable();
		tblInput.setRowHeight(20);
		tblInput.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		scrollPane.setViewportView(tblInput);
		
		// Using the created Table Model as architecture for the JTable
		inputTableModel = new InputTableModel();
		inputTableModel.inputMgmtPanel = this;
		tblInput.setModel(inputTableModel);

	}
	
	// Method that would link its repository to this management panel
	public void setDepartmentRepo(DepartmentRepo departmentRepo) {
		this.departmentRepo = departmentRepo;
	}
	
	public void setVendorRepo (VendorRepo vendorRepo) {
		this.vendorRepo = vendorRepo;
	}
	
	public void setBankRepo (BankRepo bankRepo) {
		this.bankRepo = bankRepo;
	}
	
	public void setPaymentRepo (PaymentRepo paymentRepo) {
		this.paymentRepo = paymentRepo;
	}
	
	public void setRegistrationRepo (RegistrationRepo registrationRepo) {
		this.registrationRepo = registrationRepo;
	}

}
