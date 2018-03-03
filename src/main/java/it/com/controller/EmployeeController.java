package it.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.com.dao.EmployeeMapper;
import it.com.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeMapper employeeMapper;

	@RequestMapping("/getAll")
	public List<Employee> getUsers() {
		List<Employee> employees = employeeMapper.selectByExample(null);
		System.out.println(employees);
		return employees;
	}

}
