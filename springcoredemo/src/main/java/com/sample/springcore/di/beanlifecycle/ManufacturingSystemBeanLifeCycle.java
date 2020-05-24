package com.sample.springcore.di.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ManufacturingSystemBeanLifeCycle implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("Arrange all employees before production starts");
    }

    public void doManufacturing(){
        System.out.println("Manufacturing Inprogress");
    }

    @Override
    public void destroy() throws Exception{
        System.out.println("Releive all employees after production ends");
    }



}
