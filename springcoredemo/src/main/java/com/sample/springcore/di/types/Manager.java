package com.sample.springcore.di.types;

import org.springframework.stereotype.Component;

@Component
public class Manager {

    public void sayManagerName(){
        System.out.println("My manager is shankar");
    }
}
