package az.onlinecredit.model.dto;

import az.onlinecredit.validation.UniqueCustomer;
import az.onlinecredit.validation.UniqueGuarantor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class DebtorDto {

    @NotBlank(message = "{customer.name.notnull}")
    @Size(min = 10 ,max = 30 , message = "{customer.name.length}")
    private String relatedPersonFullName;

    @NotBlank(message = "{customer.phoneNumber.notBlank}")
    @Size(min = 10 ,max = 10 , message = "{customer.phoneNumber.length}")
    private String phoneNumber;

    @NotNull(message = "{customer.salary.notnull}")
    @Positive(message = "{customer.salary.positive}")
    private BigDecimal salary;

    @UniqueCustomer(message = "{debtor.finCode.unique}")
    @NotNull(message = "{credit.finCode.notnull}")
    @Size(min = 7, max = 7 ,message = "{credit.finCode.size}")
    private String finCode;

    @NotBlank(message = "{customer.name.notnull}")
    @Size(min = 3 ,max = 25 , message = "{customer.name.length}")
    private String guarantorFullName;


    @NotNull(message = "{credit.finCode.notnull}")
    @Size(min = 7, max = 7 ,message = "{credit.finCode.size}")
    @UniqueGuarantor(message = "{guarantor.finCode.exists}")
    private String guarantorFinCode;

    @NotBlank(message = "{customer.phoneNumber.notBlank}")
    @Size(min = 10 ,max = 10 , message = "{customer.phoneNumber.length}")
    private String guarantorPhoneNumber;

    public DebtorDto() {
    }

    public String getRelatedPersonFullName() {
        return relatedPersonFullName;
    }

    public void setRelatedPersonFullName(String relatedPersonFullName) {
        this.relatedPersonFullName = relatedPersonFullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    public String getGuarantorFullName() {
        return guarantorFullName;
    }

    public void setGuarantorFullName(String guarantorFullName) {
        this.guarantorFullName = guarantorFullName;
    }

    public String getGuarantorFinCode() {
        return guarantorFinCode;
    }

    public void setGuarantorFinCode(String guarantorFinCode) {
        this.guarantorFinCode = guarantorFinCode;
    }

    public String getGuarantorPhoneNumber() {
        return guarantorPhoneNumber;
    }

    public void setGuarantorPhoneNumber(String guarantorPhoneNumber) {
        this.guarantorPhoneNumber = guarantorPhoneNumber;
    }

    @Override
    public String toString() {
        return "DebtorDto{" +
                "relatedPersonFullName='" + relatedPersonFullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", finCode='" + finCode + '\'' +
                ", guarantorFullName='" + guarantorFullName + '\'' +
                ", guarantorFinCode='" + guarantorFinCode + '\'' +
                ", guarantorPhoneNumber='" + guarantorPhoneNumber + '\'' +
                '}';
    }
}
