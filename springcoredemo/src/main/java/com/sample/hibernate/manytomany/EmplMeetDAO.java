package com.sample.hibernate.manytomany;

import com.sample.hibernate.util.HibernateFactory;
import org.hibernate.Session;

public class EmplMeetDAO {

    public void saveMeeting(final Meeting meeting){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(meeting);
        session.getTransaction().commit();
    }

}
