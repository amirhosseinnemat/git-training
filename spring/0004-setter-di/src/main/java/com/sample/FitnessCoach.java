package com.sample;

import org.springframework.stereotype.Component;

@Component
public class FitnessCoach implements Coach{

    @Override
    public String getDailyProgram() {
        return "30 minute running.";
    }
}
