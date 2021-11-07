package com.sample;


import org.springframework.stereotype.Component;

@Component
public class FintnessCoach implements Coach{

    @Override
    public String dailyTraining() {
        return "30 minute running.";
    }
}
