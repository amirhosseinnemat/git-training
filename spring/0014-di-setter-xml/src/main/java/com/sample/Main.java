package com.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Player player = context.getBean("myPlayer",Player.class);
        player.dailyRoutine();

        // close the context
        context.close();
    }
}
