package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Player{


    private Coach coach;

    @Value("${player.name}")
    private String playerName;

    @Value("${player.email}")
    private String email;

    @Autowired
    public Player(@Qualifier("fitness") Coach coach) {
        this.coach = coach;
    }

    public void saySomething() {
        System.out.println("name : " + playerName + "\nemail : " + email + "\n");
        System.out.println(coach.dailyTraining());
    }


    @PostConstruct
    public void doInit() {
        System.out.println("******************************");
        System.out.println("bean initialization");
        System.out.println("******************************");

    }


    @PreDestroy
    public void doDestroy() {
        System.out.println("******************************");
        System.out.println("bean destroy");
        System.out.println("******************************");

    }
}
