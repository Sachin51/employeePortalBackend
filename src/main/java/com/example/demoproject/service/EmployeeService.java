package com.example.demoproject.service;

import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demoproject.model.Employee;
import com.example.demoproject.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private static Logger LOGGER = Logger.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeRepository empRepo;

	public Optional<Employee> getEmployee(@PathVariable long empId) {
		return empRepo.findById(empId);
	}

	public Employee addEmployee(@RequestBody Employee employee) {
		LOGGER.info("Adding one employee ****************************");
		return empRepo.save(employee);
	}

	public Employee updateEmployee(@RequestBody Employee employee) {
		return empRepo.save(employee);
	}

	public String deleteEmployee(@PathVariable long empId) {
		empRepo.deleteById(empId);
		return "Deleted Successfully";
	}

	public List<Employee> getAllEmployees() {
		LOGGER.info("Getting all employees ****************************");
		return empRepo.findAll();
	}
}
