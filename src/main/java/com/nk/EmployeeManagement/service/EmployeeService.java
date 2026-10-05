package com.nk.EmployeeManagement.service;

import com.nk.EmployeeManagement.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee  saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(Integer id);
    Employee updateEmployee(Integer id,Employee employee);
    void  deleteEmployee(Integer id);
}
