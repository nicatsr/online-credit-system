package az.onlinecredit.validation.impl;


import az.onlinecredit.service.UserService;
import az.onlinecredit.validation.UniqueEmail;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {


    private UserService userService;

    public UniqueEmailValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean exists = userService.emailExist(value);
        return !exists;
    }
}
