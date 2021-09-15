package com.example.ktpm_spring_boot.service;

import com.example.ktpm_spring_boot.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee AddEmployee( Employee employee);
    public List<Employee> GetAllEmployee();
    public Employee GetEmployeeByID(Long id);
    public Employee UpdateEmployeeByID(Long id, Employee employee);
    public void DeteleEnployeeByID(Long id);
}
