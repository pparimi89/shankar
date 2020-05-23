package com.sample.springcore;

import com.sample.springcore.di.annotationbased.Car;
import com.sample.springcore.di.javabased.JavabasedAppConfig;
import com.sample.springcore.di.javabased.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CarTest {

    @Test
    public void testAnnotationBasedConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sample.springcore");
        context.refresh();
        Car car = (Car)context.getBean("car");
        car.getEngine().sayEngineCapacity();
    }

    @Test
    public void testJavabasedConfig(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavabasedAppConfig.class);
        Student student = (Student)context.getBean("student");
        student.sayStudentPercentage();
    }

}