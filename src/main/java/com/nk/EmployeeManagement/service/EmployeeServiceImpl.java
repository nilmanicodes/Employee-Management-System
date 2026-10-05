package com.nk.EmployeeManagement.service;

import com.nk.EmployeeManagement.entity.Employee;
import com.nk.EmployeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).get();
    }

//    @Override
//    public Employee getEmployeeByName(String name) {
//        return employeeRepository;
//    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee=employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("employee is not found by id ="+id));
        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDepartment(employee.getDepartment());
        existingEmployee.setSalary(employee.getSalary());
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        Employee existingEmployee=employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("employee is not found by id ="+id));
        employeeRepository.delete(existingEmployee);

    }
}
