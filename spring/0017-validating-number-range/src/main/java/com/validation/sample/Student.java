package com.validation.sample;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Student {

    @NotNull(message = "should not be blank")
    private String firstName;

    @NotNull(message = "should not be blank")
    private String lastName;

    @NotNull(message = "fill the blank")
    @Min(value = 0, message = "must be grater than 0")
    @Max(value = 5, message = "must be less than 5")
    private Integer freePasses;
//    private int freePasses;

    @NotNull(message = "please enter postal code")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "should be 5 character/digit")
    private String postalCode;

    public Student() {
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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
