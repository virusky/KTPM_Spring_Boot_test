package com.example.ktpm_spring_boot.repository;

import com.example.ktpm_spring_boot.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
