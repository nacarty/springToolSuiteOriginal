package com.carty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carty.Emp;
import com.carty.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService service;
	
	@GetMapping("/addEmployee")
	public Emp addEmp(int empId, String empName, String empAddress) {
		return service.createEmp(empId, empName, empAddress);
	}
	
	@DeleteMapping("/deleteEmp/{empId}")
	public String deleteEmp(@RequestParam("empId") int empId) {
		service.deleteEmp(empId);
		return "One employee removed";
	}
}
