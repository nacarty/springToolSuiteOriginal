package com.carty.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carty.model.Employee;

@RestController
public class empController {

	
	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public List<Employee> listEmps(){
		Employee emp1 = new Employee();
		emp1.setDesignation("Teacher");
		emp1.setEmpId("1");
		emp1.setName("Jarrod");
		emp1.setSalary(4321.98);
		
		Employee emp2 = new Employee();
		emp2.setDesignation("Teacher");
		emp2.setEmpId("1");
		emp2.setName("Jarro");
		emp2.setSalary(4321.98);
		
		Employee emp3 = new Employee();
		emp3.setDesignation("Programmer");
		emp3.setEmpId("3");
		emp3.setName("Rabih");
		emp3.setSalary(4321.98);
		
		Employee emp4 = new Employee();
		emp4.setDesignation("Doctor");
		emp4.setEmpId("4");
		emp4.setName("Olivier");
		emp4.setSalary(4321.98);
		
		List<Employee> list = new ArrayList<>();
		list.add(emp1); 
		list.add(emp2); 
		list.add(emp3); 
		list.add(emp4);
		
		return list;
	}
}
