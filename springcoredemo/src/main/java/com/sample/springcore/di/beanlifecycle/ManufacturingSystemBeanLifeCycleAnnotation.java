package com.sample.springcore.di.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ManufacturingSystemBeanLifeCycleAnnotation  {

    @PostConstruct
    public void postConstruction() throws Exception{
        System.out.println("Arrange all employees before production starts");
    }

    public void doManufacturing(){
        System.out.println("Manufacturing Inprogress");
    }

    @PreDestroy
    public void preDestruction() throws Exception{
        System.out.println("Releive all employees after production ends");
    }



}
