package com.sample.hibernate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartServiceDAOTest {

    @Test
    public void getCartItems() {
        final CartServiceDAO cartServiceDAO = new CartServiceDAO();
        System.out.println(" ------>>><><><> "+cartServiceDAO.getCartItems());
    }
}