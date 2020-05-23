package com.sample.springcore.di.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    FiatEngine engine;

    public FiatEngine getEngine() {
        return engine;
    }
}
