package com.sample.hibernate.onetoone;

import com.sample.hibernate.util.HibernateFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeeDAO {

    public List<Employee> getEmployees(){
        int id = 2;
        Session session = HibernateFactory.getSessionFactory().openSession();
        Query query = session.createQuery("From Employee where eid = :empId");
        System.out.println(id);
        query.setParameter("empId", id);
        return query.list();
    }

    public void saveEmployee(Employee employee){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }

}
