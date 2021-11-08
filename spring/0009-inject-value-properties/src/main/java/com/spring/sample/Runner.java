package com.spring.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

        Student student = context.getBean("student", Student.class);
        System.out.println(student.getName());
        System.out.println(student.getEmail());

        Student student2 = context.getBean("student", Student.class);


        System.out.println(student == student2);
    }
}
