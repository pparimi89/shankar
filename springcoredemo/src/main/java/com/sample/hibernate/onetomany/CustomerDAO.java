package com.sample.hibernate.onetomany;

import com.sample.hibernate.onetoone.Employee;
import com.sample.hibernate.util.HibernateFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDAO {

    public List<Customer> getCustomer(){
        Session session = HibernateFactory.getSessionFactory().openSession();
        Query query = session.createQuery("From Customer");
        return query.list();
    }

    public void saveAccount(Account account){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
    }

    public void updateAccount(Account account){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(account);
        session.getTransaction().commit();
    }

    public Account getAccount(final Integer id){
        Session session = HibernateFactory.getSessionFactory().openSession();
        return session.get(Account.class, id);
    }


/*    public void saveCustomer(Customer customer){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
    }*/

}
