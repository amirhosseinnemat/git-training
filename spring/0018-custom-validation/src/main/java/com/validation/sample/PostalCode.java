package com.validation.sample;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PostalCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PostalCode {

    // define default postal code
    public String value() default "IR";

    // define default error message
    public String message() default "must be start with IR";

    // define default groups
    public Class<?>[] groups() default {};

    // define default payload
    public Class<? extends Payload>[] payload() default {};


}
