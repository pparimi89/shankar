package com.sample.hibernate.onetoone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDAOTest {

    @Test
    void saveEmployee() {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        Address address = new Address();
        address.setCity("Chennai");
        address.setState("Tamil Nadu");
        address.setBeginDate("10/06/2000");
        address.setEndDate("10/06/2040");

        Employee employee = new Employee();
        employee.setEname("Shankar");
        employee.setEsal(25000);
        employee.setAddress(address);

        employeeDAO.saveEmployee(employee);

    }

    @Test
    void testGetEmplyees(){
        EmployeeDAO employeeDAO = new EmployeeDAO();
        System.out.println(employeeDAO.getEmployees());
    }
}