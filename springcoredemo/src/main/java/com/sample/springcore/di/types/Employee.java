package com.sample.springcore.di.types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired(required = false)
    private Company company; // Field Injection

    private Department department;

    private Manager manager;

    @Autowired
    public Employee(Department department){
        this.department = department;
    }

    @Autowired
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public Department getDepartment() {
        return department;
    }

    public Company getCompany() {
        return company;
    }
}
