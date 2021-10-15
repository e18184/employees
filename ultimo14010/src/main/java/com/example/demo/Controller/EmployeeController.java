package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.model.Employee;
import antlr.collections.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
@Autowired
private EmployeeRepository employeerepository;
@GetMapping("/employees")
public java.util.List<Employee> fetchEmployee(){
	return employeerepository.findAll();
}

}
