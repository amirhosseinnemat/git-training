package com.validation.sample;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PostalCodeConstraintValidator implements ConstraintValidator<PostalCode, String> {

    private String postalPrefix;

    @Override
    public void initialize(PostalCode postalCode) {

        postalPrefix = postalCode.value();

    }

    @Override
    // s is html form data entered by user
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (s != null) {
            result = s.startsWith(postalPrefix);
        } else {
            result = true;
        }

        return result;
    }
}
