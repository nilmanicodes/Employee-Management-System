package com.nk.EmployeeManagement.repository;

import com.nk.EmployeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.JpqlQueryBuilder;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    //Here we dont use @Repository because Jparepository give implementation at run time
    //and give functionalities automatically like CRUD opereation.
}
