package com.carty;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public Employee firstPage() {
		Employee emp = new Employee();
		emp.setEmpId("101");
		emp.setName("Olivier");
		emp.setDesignation("Team Lead");
		emp.setSalary(3000);
		
		return emp;
	}
}
