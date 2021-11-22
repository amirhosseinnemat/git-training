package com.sample;

public class Player {

    private Coach myCoach;
    private String name;
    private String email;

    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void dailyRoutine() {
        System.out.println("name : " + name);
        System.out.println("email : " + email);
        System.out.println(myCoach.dailyTraining());

    }
}
