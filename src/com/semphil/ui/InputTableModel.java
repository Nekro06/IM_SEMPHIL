package com.semphil.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import com.semphil.bean.Registration;

@SuppressWarnings("serial")
public class InputTableModel extends AbstractTableModel{

	protected InputMgmtPanel inputMgmtPanel;
	private List<Registration> currentValue;
	
	public int getColumnCount() {
		return 6;
	}
	
	public String getColumnName(int columnIndex) {
		switch(columnIndex) 
		{
			case 0:
				return "Registration Code";
			case 1:
				return "Requesting Department";
			case 2:
				return "Company Name";
			case 3:
				return "Products / Services";
			case 4:
				return "Date of Registration";
			case 5:
				return "Purpose";
			default:
				return null;
		}
	}
	
	public int getRowCount() {
		if(currentValue == null)
			return 0;
		
		return currentValue.size();
	}
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(currentValue == null)
			return null;
		
		Registration registration = currentValue.get(rowIndex);
		
		switch(columnIndex) 
		{
			case 0:
				return registration.getRegistration_code();
			case 1:
				return registration.getDepartment().getRequesting_dept();
			case 2:
				return registration.getVendor().getCompany_name();
			case 3:
				return registration.getProduct_services();
			case 4:
				return registration.getRegistration_date();
			case 5:
				return registration.getRegistration_purpose();
			default:
				return null;
		}
	}
	
	public void refresh() {
		currentValue = inputMgmtPanel.registrationRepo.getAll();
		fireTableDataChanged();
	}
	
	public Registration getByRowIndex(int rowIndex) {
		return currentValue.get(rowIndex);
	}
}
