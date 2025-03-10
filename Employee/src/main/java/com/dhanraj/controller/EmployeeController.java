package com.dhanraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhanraj.req.EmployeeReq;
import com.dhanraj.resp.EmployeeResp;
import com.dhanraj.service.impl.EmployeeServiceImpl;

@RestController
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {

	@Autowired
	public EmployeeServiceImpl service;

	@GetMapping("/all")
	public ResponseEntity<List<EmployeeResp>> getAllEmps(){
		List<EmployeeResp> listResp =  service.getAllEmps();
		return new ResponseEntity<List<EmployeeResp>>(listResp, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getOneEmployee(@PathVariable("id") Integer id){
		boolean flag = service.isEmployeeExist(id);
		String msg = null;
		if(flag) {
			EmployeeResp resp =  service.getOneEmp(id);
			return new ResponseEntity<EmployeeResp>(resp, HttpStatus.OK);
		}else {
			msg = "Employee "+id+"does not exist";
			return new ResponseEntity<String>(msg, HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/insert")
	public ResponseEntity<String> addOneEmploy(@RequestBody EmployeeReq req){
		String msg = null;
		Integer id = service.saveEmp(req);
		msg = "Employee "+id+" saved successfully";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> deleteOneEmp(@PathVariable("id") Integer id){
		boolean flag = service.isEmployeeExist(id);
		String msg = null;
		if(flag) {
			service.deleteEmps(id);
			msg = "Employee "+id+" deleted successfully";
		}else {
			msg = "Employee "+id+" does not exist";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
}
