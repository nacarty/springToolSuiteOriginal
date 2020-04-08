package com.carty;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

//import org.springframework.context.ApplicationContext;  NOt required of we use AbstractApplicationContext instead
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.carty.dao.EmpDAOImpl;
import com.carty.model.Employee;


@SpringBootApplication
public class CartySpringApplication {


	public static void main(String[] args) {
		//or ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");	but we cannot close ctx if not abstract
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		EmpDAOImpl dao=(EmpDAOImpl)ctx.getBean("employeeDAO");
		//dao.createEmp();  //this has been placed in the constructor; and the application.xml file defines the constructor for the class
		Employee e1 = new Employee(27, "Robert Madison", "President's Brother");
		Employee e2 = new Employee(28, "Ronda Betram", "Secretary of Education");
		dao.addNewEmp(e1);
		dao.addNewEmp(e2);
		System.out.println("Now get the records from the database...");
		List<Employee> x = dao.getAllEmps();
		System.out.println("Finished: There go the records from the database...");
		System.out.println(x);
		ctx.close();
	}

}
