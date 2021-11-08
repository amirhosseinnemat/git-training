package com.sample;

import org.springframework.stereotype.Component;

@Component("tennis")
public class TennisCoach implements Coach{
    @Override
    public String dailyTraining() {
        return "30 minute back-hand";
    }
}
