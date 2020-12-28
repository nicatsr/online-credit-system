package az.onlinecredit.validation;

import az.onlinecredit.validation.impl.UniqueCustomerValidator;
import az.onlinecredit.validation.impl.UniqueGuarantorValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = UniqueCustomerValidator.class)
@Documented
public @interface UniqueCustomer {
    String message() default "{guarantor.duplicate}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}