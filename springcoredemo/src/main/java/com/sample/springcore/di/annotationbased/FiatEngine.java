package com.sample.springcore.di.annotationbased;

import org.springframework.stereotype.Component;

@Component
public class FiatEngine {

    public void sayEngineCapacity(){
        System.out.println("I am 1.2 Lt diesel engine");
    }
}
