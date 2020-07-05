package com.sample.hibernate.manytomany;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmplMeetDAOTest {

    @Test
    public void saveMeeting() {
        Emp emp = new Emp();
        emp.setEdept("Account Processing");
        emp.setName("Prakash");

/*
        Emp emp1 = new Emp();
        emp1.setEdept("Account Processing");
        emp1.setName("Ranjith");

        Emp emp2 = new Emp();
        emp2.setEdept("Account Processing");
        emp2.setName("Mahesh");
*/

        Meeting meeting = new Meeting();
        meeting.setmDate("07/04/2020");
        meeting.setEmpls(Arrays.asList(emp/*, emp1, emp2*/));

        EmplMeetDAO emplMeetDAO = new EmplMeetDAO();
        emplMeetDAO.saveMeeting(meeting);
    }
}