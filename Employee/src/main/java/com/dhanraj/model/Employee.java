package com.dhanraj.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="employ")
public class Employee {

	@Id
	@Column(name = "id")
	private Integer empId;
	
	@Column(name = "name")
	private String empName;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "doj")
	private Date doj;
	
	@Column(name = "desg")
	private String empDesg;
	
	
	public Employee(Integer empId, String empName, String location, Date doj, String empDesg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.location = location;
		this.doj = doj;
		this.empDesg = empDesg;
	}


	public Employee() {
		super();
	}


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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getDoj() {
		return doj;
	}


	public void setDoj(Date doj) {
		this.doj = doj;
	}


	public String getEmpDesg() {
		return empDesg;
	}


	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}


	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", empName=" + empName + ", location=" + location + ", doj=" + doj
				+ ", empDesg=" + empDesg + "]";
	}
	
	
	
}
