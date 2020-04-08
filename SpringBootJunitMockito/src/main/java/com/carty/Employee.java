package com.carty;


//THIS APPLICATION IS JUST A DEMONSTRATION OF THE TESTING ABILITY OF MOCKITO.
//TO RUN THE TEST, RUN TestWebApp.java as JUnit
//COMPARE TestController.java and TestWebApp.java
public class Employee {

		private String empId;
		private String name;
		private String designation;
		private double salary;
	
		Employee(){
			
		}		

		public Employee(String empId, String name, String designation, double salary) {
			super();
			this.empId = empId;
			this.name = name;
			this.designation = designation;
			this.salary = salary;
		}


		public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
}
