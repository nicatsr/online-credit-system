package az.onlinecredit.model.dto;


import az.onlinecredit.validation.EqualsFields;
import az.onlinecredit.validation.UniqueEmail;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@EqualsFields(field1 = "password" , field2 = "passwordRepetition" , message = "{user.equalFields.notSame}")
public class UserDto {

    @NotBlank(message = "{customer.name.notnull}")
    @Size(min = 10 ,max = 30 , message = "{customer.name.length}")
    private String fullName;

    @NotBlank(message = "{user.email.notBlank}")
    @Email(message = "{user.email.format}")
    @UniqueEmail(message = "{user.email.uniqueEmail}")
    private String email;

    @NotBlank(message = "{user.password.notEmpty}")
    private String password;

    @NotBlank(message = "{user.confirmPassword.notEmpty}")
    private String passwordRepetition;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordRepetition() {
        return passwordRepetition;
    }

    public void setPasswordRepetition(String passwordRepetition) {
        this.passwordRepetition = passwordRepetition;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", passwordRepetition='" + passwordRepetition + '\'' +
                '}';
    }
}
