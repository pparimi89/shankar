package com.sample.springcore.di.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

class CartServiceNamedParamsTest {

    @Test
    void testAddCart() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfiguration.class);
        final CartService cartService = context.getBean(CartService.class);
        cartService.addCart(2, "pant", 3);
    }

    @Test
    public void testRetriveCart(){
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfiguration.class);
        final CartService cartService = context.getBean(CartService.class);
        final List<Cart> cartItems = cartService.getCartItems();
        System.out.println("Items in cart ---->>>> "+cartItems);
    }
    @Test
    public void testDeleteCart(){
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfiguration.class);
        final CartService cartService = context.getBean(CartService.class);
        cartService.deleteCart(2);
    }

    @Test
    public void testUpdateCart(){
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfiguration.class);
        final CartService cartService = context.getBean(CartService.class);
        cartService.updateCart(7, 1);
    }


}