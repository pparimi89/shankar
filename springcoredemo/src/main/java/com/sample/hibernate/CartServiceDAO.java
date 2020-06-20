package com.sample.hibernate;

import com.sample.hibernate.model.Cart;
import com.sample.hibernate.util.HibernateFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CartServiceDAO {

    public List<Cart> getCartItems(){
        final Session session = HibernateFactory.getSessionFactory().openSession();
        Query query = session.createQuery("From Cart");
        return (List<Cart>)query.getResultList();
    }

    public void addCartItem(int id, String name, int quantity){
        final Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        final Cart cart = new Cart();
        cart.setId(id);
        cart.setItemName(name);
        cart.setItemQuantity(quantity);
        session.save(cart);
        session.getTransaction().commit();
    }

    public void updateCartItem(int id, int quantity){
        final Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Cart cart = session.get(Cart.class, id);
        cart.setItemQuantity(quantity);
        session.saveOrUpdate(cart);
        session.getTransaction().commit();
    }


    public void deleteCartItem(int id){
        final Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Cart cart = session.get(Cart.class, id);
        session.delete(cart);
        session.getTransaction().commit();
    }

}
