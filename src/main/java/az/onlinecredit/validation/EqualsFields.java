package az.onlinecredit.validation;

import az.onlinecredit.validation.impl.EqualFieldsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EqualFieldsValidator.class)
@Documented
public @interface EqualsFields {
    String message() default "{fields.not.equal}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String field1();

    String field2();
}