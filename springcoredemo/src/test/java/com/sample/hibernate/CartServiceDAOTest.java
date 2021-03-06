package com.sample.hibernate;

import com.sample.hibernate.crud.CartServiceDAO;
import org.junit.jupiter.api.Test;

class CartServiceDAOTest {

    @Test
    public void getCartItems() {
        final CartServiceDAO cartServiceDAO = new CartServiceDAO();
        System.out.println(" ------>>><><><> "+cartServiceDAO.getCartItems());
    }

    @Test
    public void testAddCartItem() {
        final CartServiceDAO cartServiceDAO = new CartServiceDAO();
        cartServiceDAO.addCartItem(3, "Shorts", 5);
        System.out.println(" ------>>><><><> "+cartServiceDAO.getCartItems());
    }

    @Test
    public void updateCartItem() {
        final CartServiceDAO cartServiceDAO = new CartServiceDAO();
        cartServiceDAO.updateCartItem(3, 10);
        System.out.println(" ------>>><><><> "+cartServiceDAO.getCartItems());
    }

    @Test
    public void deleteCartItem() {
        final CartServiceDAO cartServiceDAO = new CartServiceDAO();
        cartServiceDAO.deleteCartItem(3);
        System.out.println(" ------>>><><><> "+cartServiceDAO.getCartItems());
    }
}