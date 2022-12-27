package com.practicespringboot.service;

import com.practicespringboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getEmployees();
    Employee getEmployeeById(long id);

}
