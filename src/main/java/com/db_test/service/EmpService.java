package com.db_test.service;

import java.util.ArrayList;

import com.db_test.modal.Employee;

public interface EmpService {
	ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee(Employee emp);
    void deleteAllData();
}
