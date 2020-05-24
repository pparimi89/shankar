package com.sample.springcore.di.types;

import org.springframework.stereotype.Component;

@Component
public class Department {

    public void sayDepartName(){
        System.out.println("I am in production and salese Department");
    }
}
