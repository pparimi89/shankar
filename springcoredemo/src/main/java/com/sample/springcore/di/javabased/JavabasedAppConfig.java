package com.sample.springcore.di.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavabasedAppConfig {

    @Bean
    public Student student(){
        return new Student();
    }

}
