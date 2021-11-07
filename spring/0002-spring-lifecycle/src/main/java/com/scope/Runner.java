package com.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config-singletone.xml");

    Animal animal = context.getBean("eagle",Animal.class);

    animal.movement();

    context.close();

    }
}
