package com.dhanraj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dhanraj.req.EmployeeReq;
import com.dhanraj.resp.EmployeeResp;


public interface IEmployee {

	public Integer saveEmp(EmployeeReq emp);
	
	public void deleteEmps(Integer id);
	
	public EmployeeResp getOneEmp(Integer id);
	
	public List<EmployeeResp> getAllEmps();
	
	public boolean isEmployeeExist(Integer id);
}
