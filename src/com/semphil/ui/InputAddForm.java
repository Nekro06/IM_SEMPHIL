package com.semphil.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Dimension;

public class InputAddForm extends JDialog {
	private JTextField txtDept_id;
	private JTextField txtCompany_id;
	private JTextField txtRequesting_dept;
	private JTextField txtRegistration_code;
	private JTextField txtProducts_services;
	private JTextField txtPayment_id;
	private JTextField txtRegistration_purpose;
	private JTextField txtRegistration_date;
	private JTextField txtCompany_name;
	private JTextField txtLocation_street;
	private JTextField txtLocation_city;
	private JTextField txtLocation_district;
	private JTextField txtLocation_country;
	private JTextField txtPostal_code;
	private JTextField txtTelephone_number;
	private JTextField txtBusiness_reg_number;
	private JTextField txtFax_number;
	private JTextField txtRegion_bank_code;
	private JTextField txtBank_name;
	private JTextField txtPayment_code;
	private JTextField txtSwift_code;
	private JTextField txtAccount_number;
	private JTextField txtContact_person;
	private JTextField txtContact_number;
	private JTextField txtEmail_address;
	private JTextField txtOrder_currency;
	private JTextField txtPort_of_lading;
	private JTextField txtIncoterms;
	public InputMgmtPanel inputMgmtPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InputAddForm dialog = new InputAddForm();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InputAddForm() {
		setTitle("NEW VENDOR / CUSTOMER REGISTRATION AGREEMENT FORM");
		setResizable(false);
		setMinimumSize(new Dimension(1200, 730));
		setPreferredSize(new Dimension(1200, 730));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			getContentPane().add(contentPane, BorderLayout.NORTH);
			GridBagLayout gbl_contentPane = new GridBagLayout();
			gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
			gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			contentPane.setLayout(gbl_contentPane);
			{
				JLabel lblHeader_1 = new JLabel("To be filled up by SEMPHIL - Requesting Department");
				lblHeader_1.setFont(new Font("Helvetica LT Std Cond", Font.BOLD | Font.ITALIC, 15));
				GridBagConstraints gbc_lblHeader_1 = new GridBagConstraints();
				gbc_lblHeader_1.anchor = GridBagConstraints.WEST;
				gbc_lblHeader_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblHeader_1.gridx = 1;
				gbc_lblHeader_1.gridy = 0;
				contentPane.add(lblHeader_1, gbc_lblHeader_1);
			}
			{
				JLabel lblDept_id = new JLabel("Department ID :");
				lblDept_id.setForeground(Color.RED);
				lblDept_id.setFont(new Font("Helvetica LT Std Light", Font.BOLD, 15));
				GridBagConstraints gbc_lblDept_id = new GridBagConstraints();
				gbc_lblDept_id.anchor = GridBagConstraints.EAST;
				gbc_lblDept_id.insets = new Insets(0, 0, 5, 5);
				gbc_lblDept_id.gridx = 0;
				gbc_lblDept_id.gridy = 1;
				contentPane.add(lblDept_id, gbc_lblDept_id);
			}
			{
				txtDept_id = new JTextField();
				txtDept_id.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtDept_id.setColumns(10);
				GridBagConstraints gbc_txtDept_id = new GridBagConstraints();
				gbc_txtDept_id.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtDept_id.insets = new Insets(0, 0, 5, 5);
				gbc_txtDept_id.gridx = 1;
				gbc_txtDept_id.gridy = 1;
				contentPane.add(txtDept_id, gbc_txtDept_id);
			}
			{
				JLabel lblCompany_id = new JLabel("Company ID :");
				lblCompany_id.setForeground(Color.RED);
				lblCompany_id.setFont(new Font("Helvetica LT Std Light", Font.BOLD, 15));
				GridBagConstraints gbc_lblCompany_id = new GridBagConstraints();
				gbc_lblCompany_id.anchor = GridBagConstraints.EAST;
				gbc_lblCompany_id.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompany_id.gridx = 2;
				gbc_lblCompany_id.gridy = 1;
				contentPane.add(lblCompany_id, gbc_lblCompany_id);
			}
			{
				txtCompany_id = new JTextField();
				txtCompany_id.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtCompany_id.setColumns(10);
				GridBagConstraints gbc_txtCompany_id = new GridBagConstraints();
				gbc_txtCompany_id.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCompany_id.insets = new Insets(0, 0, 5, 0);
				gbc_txtCompany_id.gridx = 3;
				gbc_txtCompany_id.gridy = 1;
				contentPane.add(txtCompany_id, gbc_txtCompany_id);
			}
			{
				JLabel lblRequesting_dept = new JLabel("Requesting Department :");
				lblRequesting_dept.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblRequesting_dept = new GridBagConstraints();
				gbc_lblRequesting_dept.anchor = GridBagConstraints.EAST;
				gbc_lblRequesting_dept.insets = new Insets(0, 0, 5, 5);
				gbc_lblRequesting_dept.gridx = 0;
				gbc_lblRequesting_dept.gridy = 2;
				contentPane.add(lblRequesting_dept, gbc_lblRequesting_dept);
			}
			{
				txtRequesting_dept = new JTextField();
				txtRequesting_dept.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtRequesting_dept.setColumns(10);
				GridBagConstraints gbc_txtRequesting_dept = new GridBagConstraints();
				gbc_txtRequesting_dept.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtRequesting_dept.insets = new Insets(0, 0, 5, 5);
				gbc_txtRequesting_dept.gridx = 1;
				gbc_txtRequesting_dept.gridy = 2;
				contentPane.add(txtRequesting_dept, gbc_txtRequesting_dept);
			}
			{
				JLabel lblRegistration_code = new JLabel("Registration Code :");
				lblRegistration_code.setForeground(Color.RED);
				lblRegistration_code.setFont(new Font("Helvetica LT Std Light", Font.BOLD, 15));
				GridBagConstraints gbc_lblRegistration_code = new GridBagConstraints();
				gbc_lblRegistration_code.anchor = GridBagConstraints.EAST;
				gbc_lblRegistration_code.insets = new Insets(0, 0, 5, 5);
				gbc_lblRegistration_code.gridx = 2;
				gbc_lblRegistration_code.gridy = 2;
				contentPane.add(lblRegistration_code, gbc_lblRegistration_code);
			}
			{
				txtRegistration_code = new JTextField();
				txtRegistration_code.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtRegistration_code.setColumns(10);
				GridBagConstraints gbc_txtRegistration_code = new GridBagConstraints();
				gbc_txtRegistration_code.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtRegistration_code.insets = new Insets(0, 0, 5, 0);
				gbc_txtRegistration_code.gridx = 3;
				gbc_txtRegistration_code.gridy = 2;
				contentPane.add(txtRegistration_code, gbc_txtRegistration_code);
			}
			{
				JLabel lblProducts_services = new JLabel("Products / Services :");
				lblProducts_services.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblProducts_services = new GridBagConstraints();
				gbc_lblProducts_services.anchor = GridBagConstraints.EAST;
				gbc_lblProducts_services.insets = new Insets(0, 0, 5, 5);
				gbc_lblProducts_services.gridx = 0;
				gbc_lblProducts_services.gridy = 3;
				contentPane.add(lblProducts_services, gbc_lblProducts_services);
			}
			{
				txtProducts_services = new JTextField();
				txtProducts_services.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtProducts_services.setColumns(10);
				GridBagConstraints gbc_txtProducts_services = new GridBagConstraints();
				gbc_txtProducts_services.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtProducts_services.insets = new Insets(0, 0, 5, 5);
				gbc_txtProducts_services.gridx = 1;
				gbc_txtProducts_services.gridy = 3;
				contentPane.add(txtProducts_services, gbc_txtProducts_services);
			}
			{
				JLabel lblPayment_id = new JLabel("Payment ID :");
				lblPayment_id.setForeground(Color.RED);
				lblPayment_id.setFont(new Font("Helvetica LT Std Light", Font.BOLD, 15));
				GridBagConstraints gbc_lblPayment_id = new GridBagConstraints();
				gbc_lblPayment_id.anchor = GridBagConstraints.EAST;
				gbc_lblPayment_id.insets = new Insets(0, 0, 5, 5);
				gbc_lblPayment_id.gridx = 2;
				gbc_lblPayment_id.gridy = 3;
				contentPane.add(lblPayment_id, gbc_lblPayment_id);
			}
			{
				txtPayment_id = new JTextField();
				txtPayment_id.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtPayment_id.setColumns(10);
				GridBagConstraints gbc_txtPayment_id = new GridBagConstraints();
				gbc_txtPayment_id.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtPayment_id.insets = new Insets(0, 0, 5, 0);
				gbc_txtPayment_id.gridx = 3;
				gbc_txtPayment_id.gridy = 3;
				contentPane.add(txtPayment_id, gbc_txtPayment_id);
			}
			{
				JLabel lblRegistration_purpose = new JLabel("Purpose :");
				lblRegistration_purpose.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblRegistration_purpose = new GridBagConstraints();
				gbc_lblRegistration_purpose.anchor = GridBagConstraints.EAST;
				gbc_lblRegistration_purpose.insets = new Insets(0, 0, 5, 5);
				gbc_lblRegistration_purpose.gridx = 0;
				gbc_lblRegistration_purpose.gridy = 4;
				contentPane.add(lblRegistration_purpose, gbc_lblRegistration_purpose);
			}
			{
				txtRegistration_purpose = new JTextField();
				txtRegistration_purpose.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtRegistration_purpose.setColumns(10);
				GridBagConstraints gbc_txtRegistration_purpose = new GridBagConstraints();
				gbc_txtRegistration_purpose.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtRegistration_purpose.insets = new Insets(0, 0, 5, 5);
				gbc_txtRegistration_purpose.gridx = 1;
				gbc_txtRegistration_purpose.gridy = 4;
				contentPane.add(txtRegistration_purpose, gbc_txtRegistration_purpose);
			}
			{
				JLabel lblRegistration_date = new JLabel("Date of Registration :");
				lblRegistration_date.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblRegistration_date = new GridBagConstraints();
				gbc_lblRegistration_date.anchor = GridBagConstraints.EAST;
				gbc_lblRegistration_date.insets = new Insets(0, 0, 5, 5);
				gbc_lblRegistration_date.gridx = 2;
				gbc_lblRegistration_date.gridy = 4;
				contentPane.add(lblRegistration_date, gbc_lblRegistration_date);
			}
			{
				txtRegistration_date = new JTextField();
				txtRegistration_date.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtRegistration_date.setColumns(10);
				GridBagConstraints gbc_txtRegistration_date = new GridBagConstraints();
				gbc_txtRegistration_date.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtRegistration_date.insets = new Insets(0, 0, 5, 0);
				gbc_txtRegistration_date.gridx = 3;
				gbc_txtRegistration_date.gridy = 4;
				contentPane.add(txtRegistration_date, gbc_txtRegistration_date);
			}
			{
				JLabel lblHeader_2 = new JLabel("To be filled up by VENDOR / CUSTOMER");
				lblHeader_2.setFont(new Font("Helvetica LT Std Cond", Font.BOLD | Font.ITALIC, 15));
				GridBagConstraints gbc_lblHeader_2 = new GridBagConstraints();
				gbc_lblHeader_2.anchor = GridBagConstraints.WEST;
				gbc_lblHeader_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblHeader_2.gridx = 1;
				gbc_lblHeader_2.gridy = 5;
				contentPane.add(lblHeader_2, gbc_lblHeader_2);
			}
			{
				JLabel lblSubheader_1 = new JLabel("VENDOR / CUSTOMER INFORMATION");
				lblSubheader_1.setFont(new Font("Helvetica LT Std", Font.BOLD, 13));
				GridBagConstraints gbc_lblSubheader_1 = new GridBagConstraints();
				gbc_lblSubheader_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblSubheader_1.gridx = 1;
				gbc_lblSubheader_1.gridy = 6;
				contentPane.add(lblSubheader_1, gbc_lblSubheader_1);
			}
			{
				JLabel lblCompany_name = new JLabel("Company Name :");
				lblCompany_name.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompany_name = new GridBagConstraints();
				gbc_lblCompany_name.anchor = GridBagConstraints.EAST;
				gbc_lblCompany_name.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompany_name.gridx = 0;
				gbc_lblCompany_name.gridy = 7;
				contentPane.add(lblCompany_name, gbc_lblCompany_name);
			}
			{
				txtCompany_name = new JTextField();
				txtCompany_name.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtCompany_name.setColumns(10);
				GridBagConstraints gbc_txtCompany_name = new GridBagConstraints();
				gbc_txtCompany_name.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCompany_name.insets = new Insets(0, 0, 5, 5);
				gbc_txtCompany_name.gridx = 1;
				gbc_txtCompany_name.gridy = 7;
				contentPane.add(txtCompany_name, gbc_txtCompany_name);
			}
			{
				JLabel lblLocation_street = new JLabel("Street :");
				lblLocation_street.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblLocation_street = new GridBagConstraints();
				gbc_lblLocation_street.anchor = GridBagConstraints.EAST;
				gbc_lblLocation_street.insets = new Insets(0, 0, 5, 5);
				gbc_lblLocation_street.gridx = 0;
				gbc_lblLocation_street.gridy = 8;
				contentPane.add(lblLocation_street, gbc_lblLocation_street);
			}
			{
				txtLocation_street = new JTextField();
				txtLocation_street.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtLocation_street.setColumns(10);
				GridBagConstraints gbc_txtLocation_street = new GridBagConstraints();
				gbc_txtLocation_street.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtLocation_street.insets = new Insets(0, 0, 5, 5);
				gbc_txtLocation_street.gridx = 1;
				gbc_txtLocation_street.gridy = 8;
				contentPane.add(txtLocation_street, gbc_txtLocation_street);
			}
			{
				JLabel lblLocation_city = new JLabel("City :");
				lblLocation_city.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblLocation_city = new GridBagConstraints();
				gbc_lblLocation_city.anchor = GridBagConstraints.EAST;
				gbc_lblLocation_city.insets = new Insets(0, 0, 5, 5);
				gbc_lblLocation_city.gridx = 2;
				gbc_lblLocation_city.gridy = 8;
				contentPane.add(lblLocation_city, gbc_lblLocation_city);
			}
			{
				txtLocation_city = new JTextField();
				txtLocation_city.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtLocation_city.setColumns(10);
				GridBagConstraints gbc_txtLocation_city = new GridBagConstraints();
				gbc_txtLocation_city.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtLocation_city.insets = new Insets(0, 0, 5, 0);
				gbc_txtLocation_city.gridx = 3;
				gbc_txtLocation_city.gridy = 8;
				contentPane.add(txtLocation_city, gbc_txtLocation_city);
			}
			{
				JLabel lblLocation_district = new JLabel("District :");
				lblLocation_district.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblLocation_district = new GridBagConstraints();
				gbc_lblLocation_district.anchor = GridBagConstraints.EAST;
				gbc_lblLocation_district.insets = new Insets(0, 0, 5, 5);
				gbc_lblLocation_district.gridx = 0;
				gbc_lblLocation_district.gridy = 9;
				contentPane.add(lblLocation_district, gbc_lblLocation_district);
			}
			{
				txtLocation_district = new JTextField();
				txtLocation_district.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtLocation_district.setColumns(10);
				GridBagConstraints gbc_txtLocation_district = new GridBagConstraints();
				gbc_txtLocation_district.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtLocation_district.insets = new Insets(0, 0, 5, 5);
				gbc_txtLocation_district.gridx = 1;
				gbc_txtLocation_district.gridy = 9;
				contentPane.add(txtLocation_district, gbc_txtLocation_district);
			}
			{
				JLabel lblLocation_country = new JLabel("Country :");
				lblLocation_country.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblLocation_country = new GridBagConstraints();
				gbc_lblLocation_country.anchor = GridBagConstraints.EAST;
				gbc_lblLocation_country.insets = new Insets(0, 0, 5, 5);
				gbc_lblLocation_country.gridx = 2;
				gbc_lblLocation_country.gridy = 9;
				contentPane.add(lblLocation_country, gbc_lblLocation_country);
			}
			{
				txtLocation_country = new JTextField();
				txtLocation_country.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtLocation_country.setColumns(10);
				GridBagConstraints gbc_txtLocation_country = new GridBagConstraints();
				gbc_txtLocation_country.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtLocation_country.insets = new Insets(0, 0, 5, 0);
				gbc_txtLocation_country.gridx = 3;
				gbc_txtLocation_country.gridy = 9;
				contentPane.add(txtLocation_country, gbc_txtLocation_country);
			}
			{
				JLabel lblPostal_code = new JLabel("Postal Code :");
				lblPostal_code.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblPostal_code = new GridBagConstraints();
				gbc_lblPostal_code.anchor = GridBagConstraints.EAST;
				gbc_lblPostal_code.insets = new Insets(0, 0, 5, 5);
				gbc_lblPostal_code.gridx = 0;
				gbc_lblPostal_code.gridy = 10;
				contentPane.add(lblPostal_code, gbc_lblPostal_code);
			}
			{
				txtPostal_code = new JTextField();
				txtPostal_code.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtPostal_code.setColumns(10);
				GridBagConstraints gbc_txtPostal_code = new GridBagConstraints();
				gbc_txtPostal_code.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtPostal_code.insets = new Insets(0, 0, 5, 5);
				gbc_txtPostal_code.gridx = 1;
				gbc_txtPostal_code.gridy = 10;
				contentPane.add(txtPostal_code, gbc_txtPostal_code);
			}
			{
				JLabel lblTelephone_number = new JLabel("Telephone Number :");
				lblTelephone_number.setBackground(Color.WHITE);
				lblTelephone_number.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblTelephone_number = new GridBagConstraints();
				gbc_lblTelephone_number.anchor = GridBagConstraints.EAST;
				gbc_lblTelephone_number.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelephone_number.gridx = 2;
				gbc_lblTelephone_number.gridy = 10;
				contentPane.add(lblTelephone_number, gbc_lblTelephone_number);
			}
			{
				txtTelephone_number = new JTextField();
				txtTelephone_number.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtTelephone_number.setColumns(10);
				GridBagConstraints gbc_txtTelephone_number = new GridBagConstraints();
				gbc_txtTelephone_number.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtTelephone_number.insets = new Insets(0, 0, 5, 0);
				gbc_txtTelephone_number.gridx = 3;
				gbc_txtTelephone_number.gridy = 10;
				contentPane.add(txtTelephone_number, gbc_txtTelephone_number);
			}
			{
				JLabel lblBusiness_reg_number = new JLabel("Business Reg. Number :");
				lblBusiness_reg_number.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblBusiness_reg_number = new GridBagConstraints();
				gbc_lblBusiness_reg_number.anchor = GridBagConstraints.EAST;
				gbc_lblBusiness_reg_number.insets = new Insets(0, 0, 5, 5);
				gbc_lblBusiness_reg_number.gridx = 0;
				gbc_lblBusiness_reg_number.gridy = 11;
				contentPane.add(lblBusiness_reg_number, gbc_lblBusiness_reg_number);
			}
			{
				txtBusiness_reg_number = new JTextField();
				txtBusiness_reg_number.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtBusiness_reg_number.setColumns(10);
				GridBagConstraints gbc_txtBusiness_reg_number = new GridBagConstraints();
				gbc_txtBusiness_reg_number.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtBusiness_reg_number.insets = new Insets(0, 0, 5, 5);
				gbc_txtBusiness_reg_number.gridx = 1;
				gbc_txtBusiness_reg_number.gridy = 11;
				contentPane.add(txtBusiness_reg_number, gbc_txtBusiness_reg_number);
			}
			{
				JLabel lblFax_number = new JLabel("Fax Number :");
				lblFax_number.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblFax_number = new GridBagConstraints();
				gbc_lblFax_number.anchor = GridBagConstraints.EAST;
				gbc_lblFax_number.insets = new Insets(0, 0, 5, 5);
				gbc_lblFax_number.gridx = 2;
				gbc_lblFax_number.gridy = 11;
				contentPane.add(lblFax_number, gbc_lblFax_number);
			}
			{
				txtFax_number = new JTextField();
				txtFax_number.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtFax_number.setColumns(10);
				GridBagConstraints gbc_txtFax_number = new GridBagConstraints();
				gbc_txtFax_number.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtFax_number.insets = new Insets(0, 0, 5, 0);
				gbc_txtFax_number.gridx = 3;
				gbc_txtFax_number.gridy = 11;
				contentPane.add(txtFax_number, gbc_txtFax_number);
			}
			{
				JLabel lblSubheader_2 = new JLabel("PAYMENT DATA");
				lblSubheader_2.setFont(new Font("Helvetica LT Std", Font.BOLD, 13));
				GridBagConstraints gbc_lblSubheader_2 = new GridBagConstraints();
				gbc_lblSubheader_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblSubheader_2.gridx = 1;
				gbc_lblSubheader_2.gridy = 12;
				contentPane.add(lblSubheader_2, gbc_lblSubheader_2);
			}
			{
				JLabel lblRegion_bank_code = new JLabel("Region Bank Code :");
				lblRegion_bank_code.setForeground(Color.RED);
				lblRegion_bank_code.setFont(new Font("Helvetica LT Std Light", Font.BOLD, 15));
				GridBagConstraints gbc_lblRegion_bank_code = new GridBagConstraints();
				gbc_lblRegion_bank_code.anchor = GridBagConstraints.EAST;
				gbc_lblRegion_bank_code.insets = new Insets(0, 0, 5, 5);
				gbc_lblRegion_bank_code.gridx = 0;
				gbc_lblRegion_bank_code.gridy = 13;
				contentPane.add(lblRegion_bank_code, gbc_lblRegion_bank_code);
			}
			{
				txtRegion_bank_code = new JTextField();
				txtRegion_bank_code.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtRegion_bank_code.setColumns(10);
				GridBagConstraints gbc_txtRegion_bank_code = new GridBagConstraints();
				gbc_txtRegion_bank_code.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtRegion_bank_code.insets = new Insets(0, 0, 5, 5);
				gbc_txtRegion_bank_code.gridx = 1;
				gbc_txtRegion_bank_code.gridy = 13;
				contentPane.add(txtRegion_bank_code, gbc_txtRegion_bank_code);
			}
			{
				JLabel lblBank_name = new JLabel("Bank Name :");
				lblBank_name.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblBank_name = new GridBagConstraints();
				gbc_lblBank_name.anchor = GridBagConstraints.EAST;
				gbc_lblBank_name.insets = new Insets(0, 0, 5, 5);
				gbc_lblBank_name.gridx = 2;
				gbc_lblBank_name.gridy = 13;
				contentPane.add(lblBank_name, gbc_lblBank_name);
			}
			{
				txtBank_name = new JTextField();
				txtBank_name.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtBank_name.setColumns(10);
				GridBagConstraints gbc_txtBank_name = new GridBagConstraints();
				gbc_txtBank_name.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtBank_name.insets = new Insets(0, 0, 5, 0);
				gbc_txtBank_name.gridx = 3;
				gbc_txtBank_name.gridy = 13;
				contentPane.add(txtBank_name, gbc_txtBank_name);
			}
			{
				JLabel lblPayment_code = new JLabel("Payment Code :");
				lblPayment_code.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblPayment_code = new GridBagConstraints();
				gbc_lblPayment_code.anchor = GridBagConstraints.EAST;
				gbc_lblPayment_code.insets = new Insets(0, 0, 5, 5);
				gbc_lblPayment_code.gridx = 0;
				gbc_lblPayment_code.gridy = 14;
				contentPane.add(lblPayment_code, gbc_lblPayment_code);
			}
			{
				txtPayment_code = new JTextField();
				txtPayment_code.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtPayment_code.setColumns(10);
				GridBagConstraints gbc_txtPayment_code = new GridBagConstraints();
				gbc_txtPayment_code.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtPayment_code.insets = new Insets(0, 0, 5, 5);
				gbc_txtPayment_code.gridx = 1;
				gbc_txtPayment_code.gridy = 14;
				contentPane.add(txtPayment_code, gbc_txtPayment_code);
			}
			{
				JLabel lblSwift_code = new JLabel("Swift Code / CNAPS :");
				lblSwift_code.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblSwift_code = new GridBagConstraints();
				gbc_lblSwift_code.anchor = GridBagConstraints.EAST;
				gbc_lblSwift_code.insets = new Insets(0, 0, 5, 5);
				gbc_lblSwift_code.gridx = 2;
				gbc_lblSwift_code.gridy = 14;
				contentPane.add(lblSwift_code, gbc_lblSwift_code);
			}
			{
				txtSwift_code = new JTextField();
				txtSwift_code.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtSwift_code.setColumns(10);
				GridBagConstraints gbc_txtSwift_code = new GridBagConstraints();
				gbc_txtSwift_code.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtSwift_code.insets = new Insets(0, 0, 5, 0);
				gbc_txtSwift_code.gridx = 3;
				gbc_txtSwift_code.gridy = 14;
				contentPane.add(txtSwift_code, gbc_txtSwift_code);
			}
			{
				JLabel lblAccount_number = new JLabel("Account Number :");
				lblAccount_number.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblAccount_number = new GridBagConstraints();
				gbc_lblAccount_number.anchor = GridBagConstraints.EAST;
				gbc_lblAccount_number.insets = new Insets(0, 0, 5, 5);
				gbc_lblAccount_number.gridx = 0;
				gbc_lblAccount_number.gridy = 15;
				contentPane.add(lblAccount_number, gbc_lblAccount_number);
			}
			{
				txtAccount_number = new JTextField();
				txtAccount_number.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtAccount_number.setColumns(10);
				GridBagConstraints gbc_txtAccount_number = new GridBagConstraints();
				gbc_txtAccount_number.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtAccount_number.insets = new Insets(0, 0, 5, 5);
				gbc_txtAccount_number.gridx = 1;
				gbc_txtAccount_number.gridy = 15;
				contentPane.add(txtAccount_number, gbc_txtAccount_number);
			}
			{
				JLabel lblSubheader_3 = new JLabel("CORRESPONDENCE");
				lblSubheader_3.setFont(new Font("Helvetica LT Std", Font.BOLD, 13));
				GridBagConstraints gbc_lblSubheader_3 = new GridBagConstraints();
				gbc_lblSubheader_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblSubheader_3.gridx = 1;
				gbc_lblSubheader_3.gridy = 16;
				contentPane.add(lblSubheader_3, gbc_lblSubheader_3);
			}
			{
				JLabel lblContact_person = new JLabel("Contact Person :");
				lblContact_person.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblContact_person = new GridBagConstraints();
				gbc_lblContact_person.anchor = GridBagConstraints.EAST;
				gbc_lblContact_person.insets = new Insets(0, 0, 5, 5);
				gbc_lblContact_person.gridx = 0;
				gbc_lblContact_person.gridy = 17;
				contentPane.add(lblContact_person, gbc_lblContact_person);
			}
			{
				txtContact_person = new JTextField();
				txtContact_person.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtContact_person.setColumns(10);
				GridBagConstraints gbc_txtContact_person = new GridBagConstraints();
				gbc_txtContact_person.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtContact_person.insets = new Insets(0, 0, 5, 5);
				gbc_txtContact_person.gridx = 1;
				gbc_txtContact_person.gridy = 17;
				contentPane.add(txtContact_person, gbc_txtContact_person);
			}
			{
				JLabel lblContact_number = new JLabel("Contact Number :");
				lblContact_number.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblContact_number = new GridBagConstraints();
				gbc_lblContact_number.anchor = GridBagConstraints.EAST;
				gbc_lblContact_number.insets = new Insets(0, 0, 5, 5);
				gbc_lblContact_number.gridx = 2;
				gbc_lblContact_number.gridy = 17;
				contentPane.add(lblContact_number, gbc_lblContact_number);
			}
			{
				txtContact_number = new JTextField();
				txtContact_number.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtContact_number.setColumns(10);
				GridBagConstraints gbc_txtContact_number = new GridBagConstraints();
				gbc_txtContact_number.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtContact_number.insets = new Insets(0, 0, 5, 0);
				gbc_txtContact_number.gridx = 3;
				gbc_txtContact_number.gridy = 17;
				contentPane.add(txtContact_number, gbc_txtContact_number);
			}
			{
				JLabel lblEmail_address = new JLabel("E-mail Address");
				lblEmail_address.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblEmail_address = new GridBagConstraints();
				gbc_lblEmail_address.anchor = GridBagConstraints.EAST;
				gbc_lblEmail_address.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail_address.gridx = 0;
				gbc_lblEmail_address.gridy = 18;
				contentPane.add(lblEmail_address, gbc_lblEmail_address);
			}
			{
				txtEmail_address = new JTextField();
				txtEmail_address.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtEmail_address.setColumns(10);
				GridBagConstraints gbc_txtEmail_address = new GridBagConstraints();
				gbc_txtEmail_address.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtEmail_address.insets = new Insets(0, 0, 5, 5);
				gbc_txtEmail_address.gridx = 1;
				gbc_txtEmail_address.gridy = 18;
				contentPane.add(txtEmail_address, gbc_txtEmail_address);
			}
			{
				JLabel lblSubheader_4 = new JLabel("PURCHASING INFORMATION");
				lblSubheader_4.setFont(new Font("Helvetica LT Std", Font.BOLD, 13));
				GridBagConstraints gbc_lblSubheader_4 = new GridBagConstraints();
				gbc_lblSubheader_4.insets = new Insets(0, 0, 5, 5);
				gbc_lblSubheader_4.gridx = 1;
				gbc_lblSubheader_4.gridy = 19;
				contentPane.add(lblSubheader_4, gbc_lblSubheader_4);
			}
			{
				JLabel lblOrder_currency = new JLabel("Order Currency :");
				lblOrder_currency.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblOrder_currency = new GridBagConstraints();
				gbc_lblOrder_currency.anchor = GridBagConstraints.EAST;
				gbc_lblOrder_currency.insets = new Insets(0, 0, 5, 5);
				gbc_lblOrder_currency.gridx = 0;
				gbc_lblOrder_currency.gridy = 20;
				contentPane.add(lblOrder_currency, gbc_lblOrder_currency);
			}
			{
				txtOrder_currency = new JTextField();
				txtOrder_currency.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtOrder_currency.setColumns(10);
				GridBagConstraints gbc_txtOrder_currency = new GridBagConstraints();
				gbc_txtOrder_currency.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtOrder_currency.insets = new Insets(0, 0, 5, 5);
				gbc_txtOrder_currency.gridx = 1;
				gbc_txtOrder_currency.gridy = 20;
				contentPane.add(txtOrder_currency, gbc_txtOrder_currency);
			}
			{
				JLabel lblPort_of_lading = new JLabel("Port of Lading :");
				lblPort_of_lading.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblPort_of_lading = new GridBagConstraints();
				gbc_lblPort_of_lading.anchor = GridBagConstraints.EAST;
				gbc_lblPort_of_lading.insets = new Insets(0, 0, 5, 5);
				gbc_lblPort_of_lading.gridx = 2;
				gbc_lblPort_of_lading.gridy = 20;
				contentPane.add(lblPort_of_lading, gbc_lblPort_of_lading);
			}
			{
				txtPort_of_lading = new JTextField();
				txtPort_of_lading.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtPort_of_lading.setColumns(10);
				GridBagConstraints gbc_txtPort_of_lading = new GridBagConstraints();
				gbc_txtPort_of_lading.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtPort_of_lading.insets = new Insets(0, 0, 5, 0);
				gbc_txtPort_of_lading.gridx = 3;
				gbc_txtPort_of_lading.gridy = 20;
				contentPane.add(txtPort_of_lading, gbc_txtPort_of_lading);
			}
			{
				JLabel lblIncoterms = new JLabel("Incoterms :");
				lblIncoterms.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblIncoterms = new GridBagConstraints();
				gbc_lblIncoterms.anchor = GridBagConstraints.EAST;
				gbc_lblIncoterms.insets = new Insets(0, 0, 0, 5);
				gbc_lblIncoterms.gridx = 0;
				gbc_lblIncoterms.gridy = 21;
				contentPane.add(lblIncoterms, gbc_lblIncoterms);
			}
			{
				txtIncoterms = new JTextField();
				txtIncoterms.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				txtIncoterms.setColumns(10);
				GridBagConstraints gbc_txtIncoterms = new GridBagConstraints();
				gbc_txtIncoterms.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtIncoterms.insets = new Insets(0, 0, 0, 5);
				gbc_txtIncoterms.gridx = 1;
				gbc_txtIncoterms.gridy = 21;
				contentPane.add(txtIncoterms, gbc_txtIncoterms);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel lblNewLabel = new JLabel("I hereby certify that all information above are TRUE and CORRECT.");
				lblNewLabel.setFont(new Font("Helvetica LT Std Cond", Font.ITALIC, 14));
				buttonPane.add(lblNewLabel);
			}
			{
				JButton btnSave = new JButton("SAVE");
				btnSave.setFont(new Font("Helvetica LT Std", Font.PLAIN, 13));
				btnSave.setActionCommand("OK");
				buttonPane.add(btnSave);
				getRootPane().setDefaultButton(btnSave);
			}
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.setFont(new Font("Helvetica LT Std", Font.PLAIN, 13));
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}

}
