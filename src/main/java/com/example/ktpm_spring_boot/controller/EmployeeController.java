package com.example.ktpm_spring_boot.controller;

import com.example.ktpm_spring_boot.entity.Employee;
import com.example.ktpm_spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee AddEmployee(@RequestBody Employee employee) {
        return employeeService.AddEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> GetAllEmployee(){
        return employeeService.GetAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee GetEmployeeByID(@PathVariable("id") Long id) {
        return employeeService.GetEmployeeByID(id);
    }

    @PutMapping("/employee/{id}")
    public Employee UpdateEmployeeByID(@PathVariable("id") Long id, @RequestBody Employee employee) {
        return employeeService.UpdateEmployeeByID(id, employee);
    }

    @DeleteMapping("/employee/{id}")
    public void DeleteEmployeeByID(@PathVariable("id") Long id) {
        employeeService.DeteleEnployeeByID(id);
    }
}
