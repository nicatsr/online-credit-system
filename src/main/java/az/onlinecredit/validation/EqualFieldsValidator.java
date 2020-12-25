package az.onlinecredit.validation;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

@Component
public class EqualFieldsValidator implements ConstraintValidator<EqualsFields, Object> {

    private String field1;
    private String field2;


    @Override
    public void initialize(EqualsFields constraintAnnotation) {
        field1 = constraintAnnotation.field1();
        field2 = constraintAnnotation.field2();
    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext constraintValidatorContext) {
        try {
            Object passwordValue = getFieldValue(object, field1);
            Object confirmPasswordValue = getFieldValue(object, field2);
            return passwordValue != null && passwordValue.equals(confirmPasswordValue);
        } catch (Exception e) {
            // log error
            e.printStackTrace();
            return false;
        }
    }

    private Object getFieldValue(Object object, String fieldName) throws Exception {
        Class<?> clazz = object.getClass();
        Field passwordField = clazz.getDeclaredField(fieldName);
        passwordField.setAccessible(true);
        return passwordField.get(object);
    }
}
