package com.carty.model;


public class Employee {
	private int empId;
	private String empName;
	private String empDesig;
	

	
	public Employee(int empId, String empName, String s) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesig = s;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String s) {
		this.empDesig = s;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName='" + empName + "', empDesig='" + empDesig + "']";
	}
	
}
