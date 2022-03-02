package com.vn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vn.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
