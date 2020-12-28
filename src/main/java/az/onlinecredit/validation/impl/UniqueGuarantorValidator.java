package az.onlinecredit.validation.impl;


import az.onlinecredit.service.DebtorService;
import az.onlinecredit.validation.UniqueGuarantor;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class UniqueGuarantorValidator implements ConstraintValidator<UniqueGuarantor, String> {


    private DebtorService debtorService;

    public UniqueGuarantorValidator(DebtorService debtorService) {
        this.debtorService = debtorService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean exists = debtorService.checkGuarantorExists(value);
        return !exists;
    }
}
