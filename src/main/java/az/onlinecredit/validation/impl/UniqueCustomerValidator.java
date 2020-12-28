package az.onlinecredit.validation.impl;


import az.onlinecredit.service.DebtorService;
import az.onlinecredit.validation.UniqueCustomer;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniqueCustomerValidator implements ConstraintValidator<UniqueCustomer, String> {


    private DebtorService debtorService;

    public UniqueCustomerValidator(DebtorService debtorService) {
        this.debtorService = debtorService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean exists = debtorService.checkCustomerExists(value);
        return !exists;
    }
}
