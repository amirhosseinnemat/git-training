package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Player player = context.getBean("player",Player.class);
        player.showDailyProgram();

    }
}
