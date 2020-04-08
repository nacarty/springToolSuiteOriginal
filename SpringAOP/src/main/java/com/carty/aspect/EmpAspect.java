package com.carty.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect 
@Component
public class EmpAspect {

	@Before(value="execution(* com.carty.EmpService.*(..)) and args(empId, empName, empAddress)") //These names must be as-is.
	public void b4Advice(JoinPoint jp, int empId, String empName, String empAddress) {
		System.out.println( "B4 method: "+jp.getSignature() );
		System.out.println("Create emp with empid - "+empId+" EmpName "+empName);
	}
	
	@After(value="execution(* com.carty.EmpService.*(..)) and args(empId, empName, empAddress)")
	public void afterAdvice(JoinPoint jp, int empId, String empName, String empAddress) {
		System.out.println( "After method: "+jp.getSignature() );
		
		System.out.println("Succesfully deleted employee with empid - "+empId+" EmpName "+empName);
	}
	
}
