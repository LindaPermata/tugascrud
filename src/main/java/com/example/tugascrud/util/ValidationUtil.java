package com.example.tugascrud.util;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ValidationUtil {

    private static Validator validator;

    @Autowired
    public ValidationUtil(Validator validator){
        ValidationUtil.validator = validator;
    }

    public static void validate(Object object){
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object);
        if(constraintViolations.size() != 0){
            throw new ConstraintViolationException(constraintViolations);
        }
    }
}