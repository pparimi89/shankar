package com.sample.springcore.di.aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShoppingCartAOPTest {

    @Test
    public void testAOP(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfiguration.class);
        ShoppingCartAOP shoppingCart = context.getBean(ShoppingCartAOP.class);
        shoppingCart.addGiftCardItem(1);
        shoppingCart.addGiftCardItem(2);
        shoppingCart.addGiftCardItem(3);

        shoppingCart.showAllItems();
        shoppingCart.showAllItemsTEST();
        shoppingCart.unrelatedScenario();
/*        shoppingCart.removeCart(0);
        shoppingCart.clearCart();*/
    }

    @Test
    public void testAOPAfterThrowing(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AOPConfiguration.class);
        ShoppingCartAOP shoppingCart = context.getBean(ShoppingCartAOP.class);
        //shoppingCart.unrelatedScenario();
        shoppingCart.addGiftCardItem(3);
    }

    @Test
    public void testAOPAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AOPConfiguration.class);
        context.refresh();
        ShoppingCartAOP shoppingCart = context.getBean(ShoppingCartAOP.class);
        shoppingCart.addCustomCartItem(3);
    }

}