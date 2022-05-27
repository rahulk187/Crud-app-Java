package com.db_test.repository;

import org.springframework.data.repository.CrudRepository;

import com.db_test.modal.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
