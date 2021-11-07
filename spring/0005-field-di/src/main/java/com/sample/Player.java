package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Autowired
    private Coach coach;

    public void show(){
        System.out.println(coach.dailyProgram());
    }
}
