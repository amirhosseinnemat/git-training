package com.sample;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String dailyProgram() {
        return "15 minute back-hand.";
    }
}
