package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

    public void createEmployee(Employee employee);
    public List<Employee> getAll();
    public Employee getById(Long employeeId);
    public void deleteEmployee(Long id);
    public void updateEmployee(Employee employee);
    
}
