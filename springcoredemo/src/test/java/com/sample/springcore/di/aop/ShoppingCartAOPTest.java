package com.sample.springcore.di.aop;

import com.sample.springcore.di.types.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

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


/*        shoppingCart.removeCart(0);
        shoppingCart.clearCart();*/
    }

}