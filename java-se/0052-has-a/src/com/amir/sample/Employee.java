package com.amir.sample;

/*
implementing has-a
 */
class Car {
    String brandName;
    String model;
    String color;

    public Car(String brandName, String model, String color) {
        this.brandName = brandName;
        this.model = model;
        this.color = color;
    }
} // end of Car class

public class Employee {
    String name;
    String family;
    Car car;

    public Employee(String name, String family, Car car) {
        this.name = name;
        this.family = family;
        this.car = car;
    }
} // end of Employee class

class ShowInfo {
    public static void main(String[] args) {
        Car car1 = new Car("Bmw", "530i", "navy  blue");
        Car car2 = new Car("Saipa", "Tiba 2", "white");

        Employee employee1 = new Employee("Ali", "Farahani", car1);
        Employee employee2 = new Employee("Sina", "Rahimi", car2);

        showEmployee(employee1);
        showEmployee(employee2);
    }

    public static void showEmployee(Employee employee) {
        System.out.println(employee.name + " " + employee.family + " car :");
        System.out.println(employee.car.brandName + " " + employee.car.model);
    }
} // end of ShowInfo class
