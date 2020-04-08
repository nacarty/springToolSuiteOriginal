package com.carty;

import org.springframework.stereotype.Service;


@Service
public class EmpService {

	public Emp createEmp(int empId, String empName, String empAddress) { //these parameters MUST match the attribute names used in the entity
		Emp e = new Emp();
		e.setEmpId(empId);
		e.setEmpName(empName);
		e.setEmpAddress(empAddress);
		
		return e;
	}
	
	public void deleteEmp(int empId) {
		System.out.println("Record deleted..");
	}
}
