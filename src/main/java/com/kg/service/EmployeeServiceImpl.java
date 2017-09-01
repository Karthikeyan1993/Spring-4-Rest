package com.kg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kg.bean.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setName("Karthikeyan");
		e1.setDept("IT");
		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setName("RajaRam");
		e2.setDept("IT");
		Employee e3 = new Employee();
		e3.setId(1003);
		e3.setName("Sathya");
		e3.setDept("IT");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		return employees;
	}

}
