package com.sample.springcore;

import com.sample.springcore.di.types.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class DITypesTest {

    @Test
    public void testDiTypes(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sample.springcore");
        context.refresh();
        Employee employee = (Employee)context.getBean("employee");
        employee.getCompany().getEmployeWorkingComp();// Field injection output
        employee.getDepartment().sayDepartName();// Constructor injection o/p
        employee.getManager().sayManagerName();//Setter injection o/p
    }

}