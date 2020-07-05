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

    @Test
    public void testSaveAccount(){
        CustomerDAO customerDAO = new CustomerDAO();
        Account account = new Account();
        account.setAccountCode("JNT");
        account.setAccountName("Joint account");

        Customer customer = new Customer();
        customer.setName("ShankarJnt");
        customer.setCity("Chennai");

        Customer customer1 = new Customer();
        customer1.setName("Ramesh");
        customer1.setCity("Chennai");

        Customer customer2 = new Customer();
        customer2.setName("Rakesh");
        customer2.setCity("Chennai");

        account.setCustomers(Arrays.asList(customer, customer1, customer2));
        customerDAO.saveAccount(account);
    }

/*
    @Test
    public void testSaveCustomerInAnAccount() {
        CustomerDAO customerDAO = new CustomerDAO();
        Customer customer = new Customer();
        customer.setName("John12");
        customer.setCity("Kerala2");

        final Account account = customerDAO.getAccount(23);
        account.setCustomers(Arrays.asList(customer));

        customerDAO.saveAccount(account);
    }
*/

}