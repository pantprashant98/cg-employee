package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repos.EmployeeRepository;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getById(Long employeeId) {
        return employeeRepository.getById(employeeId);
        
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee e = employeeRepository.getById(employee.getId());
        employeeRepository.save(e);
        
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
