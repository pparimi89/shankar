package com.sample.springcore.di.beanlifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ManufacturingSystemBeanLifeCycleTest {

    @Test
    public void testBeanLifeCycle(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sample.springcore");
        context.refresh();
        ManufacturingSystemBeanLifeCycle bean = context.getBean(ManufacturingSystemBeanLifeCycle.class);
        bean.doManufacturing();
        context.close();
    }

    @Test
    public void testBeanLifeCycleWithAnnotation(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sample.springcore");
        context.refresh();
        ManufacturingSystemBeanLifeCycleAnnotation bean = context.getBean(ManufacturingSystemBeanLifeCycleAnnotation.class);
        bean.doManufacturing();
        context.close();
    }

}