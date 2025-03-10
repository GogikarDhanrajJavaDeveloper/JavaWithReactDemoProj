package com.dhanraj.resp;

import java.io.Serializable;

public class EmployeeResp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer empId;
	
	private String empName;
	
	private String empLoc;
	
	private String doj;
	
	private String desg;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLoc() {
		return empLoc;
	}

	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	
	
}
