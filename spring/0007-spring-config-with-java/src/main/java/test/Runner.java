package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Coach coach = context.getBean("tennisCoach",Coach.class);
        System.out.println(coach.dailyTraining());
    }
}
