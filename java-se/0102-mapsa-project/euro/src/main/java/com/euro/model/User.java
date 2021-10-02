package com.euro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*
this is user model class
i use lombok for initializing
 */

@AllArgsConstructor
public class User {

    @Getter
    @Setter
    private String userName;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private int score;
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String role;


} // end of User Class
