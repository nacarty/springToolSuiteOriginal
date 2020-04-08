package com.carty.dao;


import java.util.List;
import com.carty.model.Employee;

public interface EmpDAO {

	public void createEmp();
	public void addNewEmp(Employee E);
	public List<Employee> getAllEmps();
}
