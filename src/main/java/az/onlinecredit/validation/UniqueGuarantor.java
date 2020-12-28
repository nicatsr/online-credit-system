package az.onlinecredit.validation;

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
@Constraint(validatedBy = UniqueGuarantorValidator.class)
@Documented
public @interface UniqueGuarantor {
    String message() default "{guarantor.duplicate}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}