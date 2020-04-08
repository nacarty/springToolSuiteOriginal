package com.saran.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saran.model.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee,Integer>{

}
