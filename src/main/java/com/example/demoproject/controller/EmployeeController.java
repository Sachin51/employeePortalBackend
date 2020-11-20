package com.example.demoproject.controller;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.model.Employee;
import com.example.demoproject.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static Logger LOGGER = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService empService;

	@GetMapping(value = "/{empId}")
	public Optional<Employee> getEmployee(@PathVariable long empId) {
		return empService.getEmployee(empId);
	}

	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		LOGGER.info("Adding one employee......................");
		return empService.addEmployee(employee);
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		LOGGER.info("Get all employees......................");
		return empService.getAllEmployees();
	}

	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee) {
		return empService.updateEmployee(employee);
	}

	@DeleteMapping
	public String deleteEmployee(@PathVariable long empId) {
		return empService.deleteEmployee(empId);
	}
}
