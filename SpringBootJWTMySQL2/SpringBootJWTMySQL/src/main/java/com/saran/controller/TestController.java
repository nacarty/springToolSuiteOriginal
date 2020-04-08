package com.saran.controller;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saran.dao.EmpRepository;
import com.saran.model.Employee;

@RestController
@RequestMapping({ "/employees" })
public class TestController {
	@Autowired
	EmpRepository repo;

	private List<Employee> employees = (List<Employee>)repo.findAll();

	@GetMapping("/get/{id}")
	public Optional<Employee> getEmpById(@PathVariable("id") Integer empId){
		  return repo.findById(empId);
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<?> deleteEmpById(@PathVariable("id") Integer empId){
			repo.deleteById(empId);
			return ResponseEntity.ok().build(); //should respond with 200 if delete done
	}
		
	
	@GetMapping("/listall")
	public List<Employee> listAllEmps() {
		return (List<Employee>) repo.findAll();
	}

	@DeleteMapping(path = { "delete/{id}" })
	public Employee delete(@PathVariable("id") int id) {
		Employee deletedEmp = null;
		for (Employee emp : employees) {
			if (emp.getEmpId() == id) {
				employees.remove(emp);
				deletedEmp = emp;
				break;
			}
		}
		return deletedEmp;
	}

	@PostMapping("/create")
	public void create(@RequestBody Employee user) { //data will be sent in the request body such as 
		repo.save(user);

	}
	
	@PutMapping("/put/{id}")
	public Employee updateEmpById(@PathVariable("id") Integer empId, @Valid @RequestBody Employee emp){
		Employee e=repo.findById(empId).get();  //using the get() here is important. It ensures that the object found by repo.findById() is extracted as a 
		e.setName(emp.getName());
		e.setDesignation(emp.getDesignation());
		e.setSalary(emp.getSalary());
		repo.save(e);
		return e;

	}
}