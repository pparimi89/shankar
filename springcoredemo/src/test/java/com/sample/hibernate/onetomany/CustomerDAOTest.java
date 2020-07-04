package com.sample.hibernate.onetomany;

import com.sample.hibernate.onetoone.EmployeeDAO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerDAOTest {

    @Test
    void getCustomer() {
        CustomerDAO customerDAO = new CustomerDAO();
        System.out.println(customerDAO.getCustomer());
    }

}