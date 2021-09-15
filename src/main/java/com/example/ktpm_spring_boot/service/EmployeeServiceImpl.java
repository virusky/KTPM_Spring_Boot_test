package com.example.ktpm_spring_boot.service;

import com.example.ktpm_spring_boot.entity.Employee;
import com.example.ktpm_spring_boot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee AddEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> GetAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }

    @Override
    public Employee GetEmployeeByID(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee UpdateEmployeeByID(Long id, Employee employee) {
        Employee emp = employeeRepository.findById(id).get();
        emp.setName(employee.getName());
        emp.setEmail(employee.getEmail());
        employeeRepository.save(emp);
        
        return emp;
    }

    @Override
    public void DeteleEnployeeByID(Long id) {
        employeeRepository.deleteById(id);
    }
}
