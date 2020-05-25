package com.sample.springcore.di.jdbc;

import com.sample.springcore.di.aop.AOPConfiguration;
import com.sample.springcore.di.aop.ShoppingCartAOP;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    @Test
    void testAddCart() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfiguration.class);
        CartService cartService = context.getBean(CartService.class);
        cartService.addCart(2, "pant", 3);
    }

    @Test
    public void testRetriveCart(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfiguration.class);
        CartService cartService = context.getBean(CartService.class);
        List<Cart> cartItems = cartService.getCartItems();
        System.out.println("Items in cart ---->>>> "+cartItems);
    }


}