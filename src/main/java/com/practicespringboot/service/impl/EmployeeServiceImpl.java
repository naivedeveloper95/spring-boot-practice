package com.practicespringboot.service.impl;

import com.practicespringboot.exception.ResourceNotFoundException;
import com.practicespringboot.model.Employee;
import com.practicespringboot.repository.EmployeeRepository;
import com.practicespringboot.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
    }
}