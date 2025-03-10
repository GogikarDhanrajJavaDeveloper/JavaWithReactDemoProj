package com.dhanraj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanraj.model.Employee;
import com.dhanraj.repo.EmployeeRepo;
import com.dhanraj.req.EmployeeReq;
import com.dhanraj.resp.EmployeeResp;
import com.dhanraj.service.IEmployee;
import com.dhanraj.utility.EmployeeUtility;

@Service
public class EmployeeServiceImpl implements IEmployee {
	
	@Autowired
	public EmployeeRepo repo;

	@Override
	public Integer saveEmp(EmployeeReq emp) {
		Employee e = new Employee();
		
		e.setEmpId(emp.getEmpId());
		e.setEmpName(emp.getEmpName());
		e.setLocation(emp.getEmpLoc());
		e.setDoj(EmployeeUtility.stringToDate(emp.getDoj()));
		e.setEmpDesg(emp.getDesg());
		return repo.save(e).getEmpId();
		
	}

	@Override
	public void deleteEmps(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public EmployeeResp getOneEmp(Integer id) {
		Employee emp = new Employee();
		EmployeeResp resp = new EmployeeResp(); 
		Boolean flag = repo.existsById(id);
		if(flag) {
			emp = repo.getById(id);
			resp.setEmpId(emp.getEmpId());
			resp.setEmpName(emp.getEmpName());
			resp.setEmpLoc(emp.getLocation());
			resp.setDoj(EmployeeUtility.dateToString(emp.getDoj()));
			resp.setDesg(emp.getEmpDesg());
		}
		return resp;
	}

	@Override
	public List<EmployeeResp> getAllEmps() {
		List<EmployeeResp> listResp = new ArrayList<EmployeeResp>();
		EmployeeResp resp = new EmployeeResp();
		List<Employee> listEmps = repo.findAll();
		for(Employee res : listEmps) {
			resp.setEmpId(res.getEmpId());
			resp.setEmpName(res.getEmpName());
			resp.setEmpLoc(res.getLocation());
			resp.setDoj(EmployeeUtility.dateToString(res.getDoj()) );
			resp.setDesg(res.getEmpDesg());
		}
		listResp.add(resp);
		return listResp;
	}

	@Override
	public boolean isEmployeeExist(Integer id) {
		boolean flag = repo.existsById(id);
		return flag;
	}

}
