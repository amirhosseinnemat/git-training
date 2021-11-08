package com.spring.sample;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("${person.name}")
    private String name;
    @Value("${person.email}")
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
