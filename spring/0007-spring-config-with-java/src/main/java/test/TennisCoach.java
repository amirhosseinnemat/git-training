package test;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String dailyTraining() {
        return "30 minute back-hand";
    }
}
