package com.carty.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import com.carty.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDAOImpl implements EmpDAO{

	JdbcTemplate jdbcTemplate;
	
	
	
	public EmpDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		createEmp();
	}

	public void createEmp() {
		try {
			jdbcTemplate.update("create table if not exists empspring(empId numeric(10), empName varchar(100), empDesig varchar(100), primary key (empId))");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addNewEmp(Employee emp) {
		jdbcTemplate.update("insert into empspring(empId, empName, empDesig) values(?,?,?)", 
				emp.getEmpId(), emp.getEmpName(), emp.getEmpDesig());
	}
	
	public List<Employee> getAllEmps(){
		return jdbcTemplate.query("select * from empspring", new EmpMapper());
	}


}

class EmpMapper implements RowMapper<Employee>{
	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException{
		int empId=rs.getInt(1);
		String empName = rs.getString(2);
		String empDesig = rs.getString(3);
		Employee e1 = new Employee(empId, empName, empDesig);
		
		return e1;
	}
}