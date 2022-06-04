package com;

public class Employee {
	private int empid;
	private String empName, address;
	
	Employee(int empid,String empName,String address) {
		super();
		this.empid=empid;
		this.empName=empName;
		this.address=address;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
