package com.amir.sample;

/*
    in this sample i want to
    copy an object value to another
    by using constructor
 */

public class User {

    public String name;
    public int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // copy value of object to another
    public User(User userObject) {
        name = userObject.name;
        id = userObject.id;;
    }

    public void display() {
        System.out.println("name : " + name);
        System.out.println("id : " + id);
    }

    public static void main(String[] args) {

        User user1 = new User("Amir",105);
        System.out.println("value of object 1 : ");
        user1.display();
        System.out.println();

        User user2 = new User(user1);
        System.out.println("value of object 2 : ");
        user2.display();

    } // end of main
} // end of User class
