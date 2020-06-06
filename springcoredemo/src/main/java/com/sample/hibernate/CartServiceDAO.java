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

}
