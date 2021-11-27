package com.sample;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String gender;

    // for options
    private LinkedHashMap<String, String> countryOption;

    //for checkbox
    private String[] operatingSystem;

    public Student() {
        countryOption = new LinkedHashMap<>();
        countryOption.put("IR","Iran");
        countryOption.put("FR","France");
        countryOption.put("DE","Germany");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOption() {
        return countryOption;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
