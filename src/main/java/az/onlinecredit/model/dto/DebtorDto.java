package az.onlinecredit.model.dto;

import java.math.BigDecimal;

public class DebtorDto {

    private String relatedPersonFullName;

    private String phoneNumber;

    private BigDecimal salary;

    private String finCode;

    private String guarantorFullName;

    private String guarantorFinCode;

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
