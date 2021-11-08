package com.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Coach coach = context.getBean("fitnessCoach", Coach.class);

        System.out.println(coach.dailyTrainingProgram());

        //because of singleton scope new request for bean return instance and never execute the bean method
        Coach coach1 = context.getBean("fitnessCoach", Coach.class);
        System.out.println(coach1.dailyTrainingProgram());

    }
}
