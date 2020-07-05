package com.sample.hibernate.manytoone;

import org.junit.jupiter.api.Test;

class ItemDAOTest {

    @Test
    public void testSaveItem() {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setQuantity(10);

        Item item = new Item();
        item.setItemName("Pant");
        item.setItemDesc("Pant is xxl large");
        shoppingCart.setItem(item);
        ItemDAO itemDAO = new ItemDAO();
        itemDAO.saveShoppingCart(shoppingCart);

    }
}