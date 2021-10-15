package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class Ultimo14010Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Ultimo14010Application.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee1 = Employee.builder()
				.firstName("Ramesh")
				.lastName("Fadatare")
				.email("ramesh@gmail.com")
				.build();
		Employee employee2 = Employee.builder()
				.firstName("Tony")
				.lastName("Stark")
				.email("tony@gmail.com")
				.build();
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
				
	}

}
