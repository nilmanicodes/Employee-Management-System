package com.nk.EmployeeManagement.entity;

import jakarta.persistence.*;

@Entity
//@Entity is used for mapping from class name to table name in database
@Table(name = "employees")
//@Table is used when table name and class name is different
public class Employee {
    //Table name is employees.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Generated is used for autoincrement.
    private  Integer id;
    @Column(nullable = false,length=50)
    //@Columan is used for validation  for not null and define its length.
    private  String name;

    @Column(nullable = false,length=50)
    private String email;

    @Column(nullable = false,length=50)
    private  String department;

    @Column(nullable = false)
    private Double salary;

    @Transient
    private String temp;

    public Employee() {
    }

    public Employee(Integer id, String name, String email, String department, Double salary, String temp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.temp = temp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
