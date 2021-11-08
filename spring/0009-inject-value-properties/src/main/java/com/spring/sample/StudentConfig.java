package com.spring.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("person-info.properties")
public class StudentConfig {

    @Bean
    @Scope("prototype")
    public Student student(){
        System.out.println("inside bean");
        return new Student();
    }
}
