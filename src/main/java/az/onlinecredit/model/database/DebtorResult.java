package az.onlinecredit.model.database;

import java.math.BigDecimal;

public class DebtorResult {

    private String relatedPerson;

    private String debtorPhoneNumber;

    private BigDecimal salary;

    private String debtorFinCode;

    private String guarantorFullName;

    private String guarantorFinCode;

    private String guarantorPhoneNumber;

    public String getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(String relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    public String getDebtorPhoneNumber() {
        return debtorPhoneNumber;
    }

    public void setDebtorPhoneNumber(String debtorPhoneNumber) {
        this.debtorPhoneNumber = debtorPhoneNumber;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getDebtorFinCode() {
        return debtorFinCode;
    }

    public void setDebtorFinCode(String debtorFinCode) {
        this.debtorFinCode = debtorFinCode;
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
        return "DebtorResult{" +
                "relatedPerson='" + relatedPerson + '\'' +
                ", debtorPhoneNumber='" + debtorPhoneNumber + '\'' +
                ", salary=" + salary +
                ", debtorFinCode='" + debtorFinCode + '\'' +
                ", guarantorFullName='" + guarantorFullName + '\'' +
                ", guarantorFinCode='" + guarantorFinCode + '\'' +
                ", guarantorPhoneNumber='" + guarantorPhoneNumber + '\'' +
                '}';
    }
}
