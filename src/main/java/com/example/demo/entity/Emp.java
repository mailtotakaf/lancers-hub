package com.example.demo.entity;

import java.util.List;

public class Emp{
	
//	private Integer empId;
	private List<String> empId;
	
	private String dptId;

	private String empName;
	

	

	public List<String> getEmpId() {
		return empId;
	}

	public void setEmpId(List<String> empId) {
		this.empId = empId;
	}

	public String getDptId() {
		return dptId;
	}

	public void setDptId(String dptId) {
		this.dptId = dptId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}