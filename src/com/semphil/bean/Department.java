package com.semphil.bean;

public class Department {
	
	private String dept_id;
	private String requesting_dept;
	
	public Department(String dept_id, String requesting_dept) {
		super();
		this.dept_id = dept_id;
		this.requesting_dept = requesting_dept;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public String getRequesting_dept() {
		return requesting_dept;
	}

	public void setRequesting_dept(String requesting_dept) {
		this.requesting_dept = requesting_dept;
	}

}
