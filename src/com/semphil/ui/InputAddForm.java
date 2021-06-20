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
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
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
				JLabel lblRequestingDepartment = new JLabel("Requesting Department :");
				lblRequestingDepartment.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblRequestingDepartment = new GridBagConstraints();
				gbc_lblRequestingDepartment.anchor = GridBagConstraints.EAST;
				gbc_lblRequestingDepartment.insets = new Insets(0, 0, 5, 5);
				gbc_lblRequestingDepartment.gridx = 0;
				gbc_lblRequestingDepartment.gridy = 2;
				contentPane.add(lblRequestingDepartment, gbc_lblRequestingDepartment);
			}
			{
				textField_2 = new JTextField();
				textField_2.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_2.setColumns(10);
				GridBagConstraints gbc_textField_2 = new GridBagConstraints();
				gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_2.insets = new Insets(0, 0, 5, 5);
				gbc_textField_2.gridx = 1;
				gbc_textField_2.gridy = 2;
				contentPane.add(textField_2, gbc_textField_2);
			}
			{
				JLabel lblRegistrationCode = new JLabel("Registration Code :");
				lblRegistrationCode.setForeground(Color.RED);
				lblRegistrationCode.setFont(new Font("Helvetica LT Std Light", Font.BOLD, 15));
				GridBagConstraints gbc_lblRegistrationCode = new GridBagConstraints();
				gbc_lblRegistrationCode.anchor = GridBagConstraints.EAST;
				gbc_lblRegistrationCode.insets = new Insets(0, 0, 5, 5);
				gbc_lblRegistrationCode.gridx = 2;
				gbc_lblRegistrationCode.gridy = 2;
				contentPane.add(lblRegistrationCode, gbc_lblRegistrationCode);
			}
			{
				textField_3 = new JTextField();
				textField_3.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_3.setColumns(10);
				GridBagConstraints gbc_textField_3 = new GridBagConstraints();
				gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_3.insets = new Insets(0, 0, 5, 0);
				gbc_textField_3.gridx = 3;
				gbc_textField_3.gridy = 2;
				contentPane.add(textField_3, gbc_textField_3);
			}
			{
				JLabel lblProductsServices = new JLabel("Products / Services :");
				lblProductsServices.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblProductsServices = new GridBagConstraints();
				gbc_lblProductsServices.anchor = GridBagConstraints.EAST;
				gbc_lblProductsServices.insets = new Insets(0, 0, 5, 5);
				gbc_lblProductsServices.gridx = 0;
				gbc_lblProductsServices.gridy = 3;
				contentPane.add(lblProductsServices, gbc_lblProductsServices);
			}
			{
				textField_4 = new JTextField();
				textField_4.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_4.setColumns(10);
				GridBagConstraints gbc_textField_4 = new GridBagConstraints();
				gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_4.insets = new Insets(0, 0, 5, 5);
				gbc_textField_4.gridx = 1;
				gbc_textField_4.gridy = 3;
				contentPane.add(textField_4, gbc_textField_4);
			}
			{
				JLabel lblPaymentId = new JLabel("Payment ID :");
				lblPaymentId.setForeground(Color.RED);
				lblPaymentId.setFont(new Font("Helvetica LT Std Light", Font.BOLD, 15));
				GridBagConstraints gbc_lblPaymentId = new GridBagConstraints();
				gbc_lblPaymentId.anchor = GridBagConstraints.EAST;
				gbc_lblPaymentId.insets = new Insets(0, 0, 5, 5);
				gbc_lblPaymentId.gridx = 2;
				gbc_lblPaymentId.gridy = 3;
				contentPane.add(lblPaymentId, gbc_lblPaymentId);
			}
			{
				textField_5 = new JTextField();
				textField_5.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_5.setColumns(10);
				GridBagConstraints gbc_textField_5 = new GridBagConstraints();
				gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_5.insets = new Insets(0, 0, 5, 0);
				gbc_textField_5.gridx = 3;
				gbc_textField_5.gridy = 3;
				contentPane.add(textField_5, gbc_textField_5);
			}
			{
				JLabel lblPurpose = new JLabel("Purpose :");
				lblPurpose.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblPurpose = new GridBagConstraints();
				gbc_lblPurpose.anchor = GridBagConstraints.EAST;
				gbc_lblPurpose.insets = new Insets(0, 0, 5, 5);
				gbc_lblPurpose.gridx = 0;
				gbc_lblPurpose.gridy = 4;
				contentPane.add(lblPurpose, gbc_lblPurpose);
			}
			{
				textField_6 = new JTextField();
				textField_6.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_6.setColumns(10);
				GridBagConstraints gbc_textField_6 = new GridBagConstraints();
				gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_6.insets = new Insets(0, 0, 5, 5);
				gbc_textField_6.gridx = 1;
				gbc_textField_6.gridy = 4;
				contentPane.add(textField_6, gbc_textField_6);
			}
			{
				JLabel lblDate = new JLabel("Date of Registration :");
				lblDate.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblDate = new GridBagConstraints();
				gbc_lblDate.anchor = GridBagConstraints.EAST;
				gbc_lblDate.insets = new Insets(0, 0, 5, 5);
				gbc_lblDate.gridx = 2;
				gbc_lblDate.gridy = 4;
				contentPane.add(lblDate, gbc_lblDate);
			}
			{
				textField_7 = new JTextField();
				textField_7.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_7.setColumns(10);
				GridBagConstraints gbc_textField_7 = new GridBagConstraints();
				gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_7.insets = new Insets(0, 0, 5, 0);
				gbc_textField_7.gridx = 3;
				gbc_textField_7.gridy = 4;
				contentPane.add(textField_7, gbc_textField_7);
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
				JLabel lblCompanyName = new JLabel("Company Name :");
				lblCompanyName.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName = new GridBagConstraints();
				gbc_lblCompanyName.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName.gridx = 0;
				gbc_lblCompanyName.gridy = 7;
				contentPane.add(lblCompanyName, gbc_lblCompanyName);
			}
			{
				textField_8 = new JTextField();
				textField_8.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_8.setColumns(10);
				GridBagConstraints gbc_textField_8 = new GridBagConstraints();
				gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_8.insets = new Insets(0, 0, 5, 5);
				gbc_textField_8.gridx = 1;
				gbc_textField_8.gridy = 7;
				contentPane.add(textField_8, gbc_textField_8);
			}
			{
				JLabel lblStreet = new JLabel("Street :");
				lblStreet.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblStreet = new GridBagConstraints();
				gbc_lblStreet.anchor = GridBagConstraints.EAST;
				gbc_lblStreet.insets = new Insets(0, 0, 5, 5);
				gbc_lblStreet.gridx = 0;
				gbc_lblStreet.gridy = 8;
				contentPane.add(lblStreet, gbc_lblStreet);
			}
			{
				textField_9 = new JTextField();
				textField_9.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_9.setColumns(10);
				GridBagConstraints gbc_textField_9 = new GridBagConstraints();
				gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_9.insets = new Insets(0, 0, 5, 5);
				gbc_textField_9.gridx = 1;
				gbc_textField_9.gridy = 8;
				contentPane.add(textField_9, gbc_textField_9);
			}
			{
				JLabel lblCompanyName_2 = new JLabel("City :");
				lblCompanyName_2.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_2 = new GridBagConstraints();
				gbc_lblCompanyName_2.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_2.gridx = 2;
				gbc_lblCompanyName_2.gridy = 8;
				contentPane.add(lblCompanyName_2, gbc_lblCompanyName_2);
			}
			{
				textField_10 = new JTextField();
				textField_10.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_10.setColumns(10);
				GridBagConstraints gbc_textField_10 = new GridBagConstraints();
				gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_10.insets = new Insets(0, 0, 5, 0);
				gbc_textField_10.gridx = 3;
				gbc_textField_10.gridy = 8;
				contentPane.add(textField_10, gbc_textField_10);
			}
			{
				JLabel lblCompanyName_3 = new JLabel("District :");
				lblCompanyName_3.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_3 = new GridBagConstraints();
				gbc_lblCompanyName_3.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_3.gridx = 0;
				gbc_lblCompanyName_3.gridy = 9;
				contentPane.add(lblCompanyName_3, gbc_lblCompanyName_3);
			}
			{
				textField_11 = new JTextField();
				textField_11.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_11.setColumns(10);
				GridBagConstraints gbc_textField_11 = new GridBagConstraints();
				gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_11.insets = new Insets(0, 0, 5, 5);
				gbc_textField_11.gridx = 1;
				gbc_textField_11.gridy = 9;
				contentPane.add(textField_11, gbc_textField_11);
			}
			{
				JLabel lblCompanyName_6 = new JLabel("Country :");
				lblCompanyName_6.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_6 = new GridBagConstraints();
				gbc_lblCompanyName_6.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_6.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_6.gridx = 2;
				gbc_lblCompanyName_6.gridy = 9;
				contentPane.add(lblCompanyName_6, gbc_lblCompanyName_6);
			}
			{
				textField_12 = new JTextField();
				textField_12.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_12.setColumns(10);
				GridBagConstraints gbc_textField_12 = new GridBagConstraints();
				gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_12.insets = new Insets(0, 0, 5, 0);
				gbc_textField_12.gridx = 3;
				gbc_textField_12.gridy = 9;
				contentPane.add(textField_12, gbc_textField_12);
			}
			{
				JLabel lblCompanyName_4 = new JLabel("Postal Code :");
				lblCompanyName_4.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_4 = new GridBagConstraints();
				gbc_lblCompanyName_4.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_4.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_4.gridx = 0;
				gbc_lblCompanyName_4.gridy = 10;
				contentPane.add(lblCompanyName_4, gbc_lblCompanyName_4);
			}
			{
				textField_13 = new JTextField();
				textField_13.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_13.setColumns(10);
				GridBagConstraints gbc_textField_13 = new GridBagConstraints();
				gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_13.insets = new Insets(0, 0, 5, 5);
				gbc_textField_13.gridx = 1;
				gbc_textField_13.gridy = 10;
				contentPane.add(textField_13, gbc_textField_13);
			}
			{
				JLabel lblCompanyName_7 = new JLabel("Telephone Number :");
				lblCompanyName_7.setBackground(Color.WHITE);
				lblCompanyName_7.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_7 = new GridBagConstraints();
				gbc_lblCompanyName_7.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_7.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_7.gridx = 2;
				gbc_lblCompanyName_7.gridy = 10;
				contentPane.add(lblCompanyName_7, gbc_lblCompanyName_7);
			}
			{
				textField_14 = new JTextField();
				textField_14.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_14.setColumns(10);
				GridBagConstraints gbc_textField_14 = new GridBagConstraints();
				gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_14.insets = new Insets(0, 0, 5, 0);
				gbc_textField_14.gridx = 3;
				gbc_textField_14.gridy = 10;
				contentPane.add(textField_14, gbc_textField_14);
			}
			{
				JLabel lblCompanyName_5 = new JLabel("Business Reg. Number :");
				lblCompanyName_5.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_5 = new GridBagConstraints();
				gbc_lblCompanyName_5.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_5.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_5.gridx = 0;
				gbc_lblCompanyName_5.gridy = 11;
				contentPane.add(lblCompanyName_5, gbc_lblCompanyName_5);
			}
			{
				textField_15 = new JTextField();
				textField_15.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_15.setColumns(10);
				GridBagConstraints gbc_textField_15 = new GridBagConstraints();
				gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_15.insets = new Insets(0, 0, 5, 5);
				gbc_textField_15.gridx = 1;
				gbc_textField_15.gridy = 11;
				contentPane.add(textField_15, gbc_textField_15);
			}
			{
				JLabel lblCompanyName_8 = new JLabel("Fax Number :");
				lblCompanyName_8.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_8 = new GridBagConstraints();
				gbc_lblCompanyName_8.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_8.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_8.gridx = 2;
				gbc_lblCompanyName_8.gridy = 11;
				contentPane.add(lblCompanyName_8, gbc_lblCompanyName_8);
			}
			{
				textField_16 = new JTextField();
				textField_16.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_16.setColumns(10);
				GridBagConstraints gbc_textField_16 = new GridBagConstraints();
				gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_16.insets = new Insets(0, 0, 5, 0);
				gbc_textField_16.gridx = 3;
				gbc_textField_16.gridy = 11;
				contentPane.add(textField_16, gbc_textField_16);
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
				JLabel lblCompanyName_1 = new JLabel("Region Bank Code :");
				lblCompanyName_1.setForeground(Color.RED);
				lblCompanyName_1.setFont(new Font("Helvetica LT Std Light", Font.BOLD, 15));
				GridBagConstraints gbc_lblCompanyName_1 = new GridBagConstraints();
				gbc_lblCompanyName_1.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_1.gridx = 0;
				gbc_lblCompanyName_1.gridy = 13;
				contentPane.add(lblCompanyName_1, gbc_lblCompanyName_1);
			}
			{
				textField_17 = new JTextField();
				textField_17.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_17.setColumns(10);
				GridBagConstraints gbc_textField_17 = new GridBagConstraints();
				gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_17.insets = new Insets(0, 0, 5, 5);
				gbc_textField_17.gridx = 1;
				gbc_textField_17.gridy = 13;
				contentPane.add(textField_17, gbc_textField_17);
			}
			{
				JLabel lblCompanyName_9 = new JLabel("Bank Name :");
				lblCompanyName_9.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_9 = new GridBagConstraints();
				gbc_lblCompanyName_9.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_9.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_9.gridx = 2;
				gbc_lblCompanyName_9.gridy = 13;
				contentPane.add(lblCompanyName_9, gbc_lblCompanyName_9);
			}
			{
				textField_18 = new JTextField();
				textField_18.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_18.setColumns(10);
				GridBagConstraints gbc_textField_18 = new GridBagConstraints();
				gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_18.insets = new Insets(0, 0, 5, 0);
				gbc_textField_18.gridx = 3;
				gbc_textField_18.gridy = 13;
				contentPane.add(textField_18, gbc_textField_18);
			}
			{
				JLabel lblCompanyName_10 = new JLabel("Payment Code :");
				lblCompanyName_10.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_10 = new GridBagConstraints();
				gbc_lblCompanyName_10.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_10.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_10.gridx = 0;
				gbc_lblCompanyName_10.gridy = 14;
				contentPane.add(lblCompanyName_10, gbc_lblCompanyName_10);
			}
			{
				textField_19 = new JTextField();
				textField_19.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_19.setColumns(10);
				GridBagConstraints gbc_textField_19 = new GridBagConstraints();
				gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_19.insets = new Insets(0, 0, 5, 5);
				gbc_textField_19.gridx = 1;
				gbc_textField_19.gridy = 14;
				contentPane.add(textField_19, gbc_textField_19);
			}
			{
				JLabel lblCompanyName_12 = new JLabel("Swift Code / CNAPS :");
				lblCompanyName_12.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_12 = new GridBagConstraints();
				gbc_lblCompanyName_12.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_12.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_12.gridx = 2;
				gbc_lblCompanyName_12.gridy = 14;
				contentPane.add(lblCompanyName_12, gbc_lblCompanyName_12);
			}
			{
				textField_20 = new JTextField();
				textField_20.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_20.setColumns(10);
				GridBagConstraints gbc_textField_20 = new GridBagConstraints();
				gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_20.insets = new Insets(0, 0, 5, 0);
				gbc_textField_20.gridx = 3;
				gbc_textField_20.gridy = 14;
				contentPane.add(textField_20, gbc_textField_20);
			}
			{
				JLabel lblCompanyName_11 = new JLabel("Account Number :");
				lblCompanyName_11.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_11 = new GridBagConstraints();
				gbc_lblCompanyName_11.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_11.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_11.gridx = 0;
				gbc_lblCompanyName_11.gridy = 15;
				contentPane.add(lblCompanyName_11, gbc_lblCompanyName_11);
			}
			{
				textField_21 = new JTextField();
				textField_21.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_21.setColumns(10);
				GridBagConstraints gbc_textField_21 = new GridBagConstraints();
				gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_21.insets = new Insets(0, 0, 5, 5);
				gbc_textField_21.gridx = 1;
				gbc_textField_21.gridy = 15;
				contentPane.add(textField_21, gbc_textField_21);
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
				JLabel lblCompanyName_14 = new JLabel("Contact Person :");
				lblCompanyName_14.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_14 = new GridBagConstraints();
				gbc_lblCompanyName_14.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_14.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_14.gridx = 0;
				gbc_lblCompanyName_14.gridy = 17;
				contentPane.add(lblCompanyName_14, gbc_lblCompanyName_14);
			}
			{
				textField_22 = new JTextField();
				textField_22.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_22.setColumns(10);
				GridBagConstraints gbc_textField_22 = new GridBagConstraints();
				gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_22.insets = new Insets(0, 0, 5, 5);
				gbc_textField_22.gridx = 1;
				gbc_textField_22.gridy = 17;
				contentPane.add(textField_22, gbc_textField_22);
			}
			{
				JLabel lblCompanyName_15 = new JLabel("Contact Number :");
				lblCompanyName_15.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_15 = new GridBagConstraints();
				gbc_lblCompanyName_15.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_15.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_15.gridx = 2;
				gbc_lblCompanyName_15.gridy = 17;
				contentPane.add(lblCompanyName_15, gbc_lblCompanyName_15);
			}
			{
				textField_23 = new JTextField();
				textField_23.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_23.setColumns(10);
				GridBagConstraints gbc_textField_23 = new GridBagConstraints();
				gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_23.insets = new Insets(0, 0, 5, 0);
				gbc_textField_23.gridx = 3;
				gbc_textField_23.gridy = 17;
				contentPane.add(textField_23, gbc_textField_23);
			}
			{
				JLabel lblCompanyName_16 = new JLabel("E-mail Address");
				lblCompanyName_16.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_16 = new GridBagConstraints();
				gbc_lblCompanyName_16.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_16.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_16.gridx = 0;
				gbc_lblCompanyName_16.gridy = 18;
				contentPane.add(lblCompanyName_16, gbc_lblCompanyName_16);
			}
			{
				textField_24 = new JTextField();
				textField_24.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_24.setColumns(10);
				GridBagConstraints gbc_textField_24 = new GridBagConstraints();
				gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_24.insets = new Insets(0, 0, 5, 5);
				gbc_textField_24.gridx = 1;
				gbc_textField_24.gridy = 18;
				contentPane.add(textField_24, gbc_textField_24);
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
				JLabel lblCompanyName_17 = new JLabel("Order Currency :");
				lblCompanyName_17.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_17 = new GridBagConstraints();
				gbc_lblCompanyName_17.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_17.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_17.gridx = 0;
				gbc_lblCompanyName_17.gridy = 20;
				contentPane.add(lblCompanyName_17, gbc_lblCompanyName_17);
			}
			{
				textField_25 = new JTextField();
				textField_25.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_25.setColumns(10);
				GridBagConstraints gbc_textField_25 = new GridBagConstraints();
				gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_25.insets = new Insets(0, 0, 5, 5);
				gbc_textField_25.gridx = 1;
				gbc_textField_25.gridy = 20;
				contentPane.add(textField_25, gbc_textField_25);
			}
			{
				JLabel lblCompanyName_19 = new JLabel("Port of Lading :");
				lblCompanyName_19.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_19 = new GridBagConstraints();
				gbc_lblCompanyName_19.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_19.insets = new Insets(0, 0, 5, 5);
				gbc_lblCompanyName_19.gridx = 2;
				gbc_lblCompanyName_19.gridy = 20;
				contentPane.add(lblCompanyName_19, gbc_lblCompanyName_19);
			}
			{
				textField_26 = new JTextField();
				textField_26.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_26.setColumns(10);
				GridBagConstraints gbc_textField_26 = new GridBagConstraints();
				gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_26.insets = new Insets(0, 0, 5, 0);
				gbc_textField_26.gridx = 3;
				gbc_textField_26.gridy = 20;
				contentPane.add(textField_26, gbc_textField_26);
			}
			{
				JLabel lblCompanyName_18 = new JLabel("Incoterms :");
				lblCompanyName_18.setFont(new Font("Helvetica LT Std Light", Font.PLAIN, 15));
				GridBagConstraints gbc_lblCompanyName_18 = new GridBagConstraints();
				gbc_lblCompanyName_18.anchor = GridBagConstraints.EAST;
				gbc_lblCompanyName_18.insets = new Insets(0, 0, 0, 5);
				gbc_lblCompanyName_18.gridx = 0;
				gbc_lblCompanyName_18.gridy = 21;
				contentPane.add(lblCompanyName_18, gbc_lblCompanyName_18);
			}
			{
				textField_27 = new JTextField();
				textField_27.setFont(new Font("Helvetica LT Std", Font.PLAIN, 16));
				textField_27.setColumns(10);
				GridBagConstraints gbc_textField_27 = new GridBagConstraints();
				gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
				gbc_textField_27.insets = new Insets(0, 0, 0, 5);
				gbc_textField_27.gridx = 1;
				gbc_textField_27.gridy = 21;
				contentPane.add(textField_27, gbc_textField_27);
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
