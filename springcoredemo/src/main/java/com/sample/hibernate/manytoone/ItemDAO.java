package com.sample.hibernate.manytoone;

import com.sample.hibernate.util.HibernateFactory;
import org.hibernate.Session;

public class ItemDAO {

    public void saveItem(Item item){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
    }

    public void saveShoppingCart(ShoppingCart shoppingCart){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(shoppingCart);
        session.getTransaction().commit();
    }

}
