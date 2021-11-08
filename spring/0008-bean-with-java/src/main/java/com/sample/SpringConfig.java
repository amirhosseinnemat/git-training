package com.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sample") // optional
public class SpringConfig {

    @Bean
    public Coach fitnessCoach() {
        System.out.println("inside fitness bean");
        return new FitnessCoach();
    }
}
