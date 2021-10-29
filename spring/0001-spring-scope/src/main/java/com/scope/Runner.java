package com.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("spring-config-singletone.xml");
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("spring-config-prototype.xml");


        System.out.println("singletone scope");
        Eagle eagle = context1.getBean("eagle",Eagle.class);
        Eagle eagle1 = context1.getBean("eagle",Eagle.class);
        eagle.setColor("gray");
        System.out.println(eagle.getColor());
        System.out.println(eagle1.getColor());

        System.out.println("*************************************");


        System.out.println("prototype scope");
        Eagle eagle2 = context2.getBean("eagle",Eagle.class);
        Eagle eagle3 = context2.getBean("eagle",Eagle.class);
        eagle2.setColor("brown");
        System.out.println(eagle2.getColor());
        System.out.println(eagle3.getColor());


    }
}
