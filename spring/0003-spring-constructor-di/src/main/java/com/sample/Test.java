package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {

    private Coach coach;


//    @Autowired
    public Test(Coach coach) {
        this.coach = coach;
    }

    public void saySomething() {
        System.out.println(coach.dailyTraining());
    }
}
