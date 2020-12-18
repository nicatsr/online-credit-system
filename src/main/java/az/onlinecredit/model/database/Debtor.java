package az.onlinecredit.model.database;

import java.math.BigDecimal;

public class Debtor {

    private long id;

    private String relatedPersonFullName;

    private String phoneNumber;

    private BigDecimal salary;

    private String finCode;

    private long userId;

    private long guarantorId;


    public Debtor(long id, String relatedPersonFullName, String phoneNumber, BigDecimal salary, String finCode, long userId, long guarantorId) {
        this.id = id;
        this.relatedPersonFullName = relatedPersonFullName;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.finCode = finCode;
        this.userId = userId;
        this.guarantorId = guarantorId;
    }

    public Debtor() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getGuarantorId() {
        return guarantorId;
    }

    public void setGuarantorId(long guarantorId) {
        this.guarantorId = guarantorId;
    }

    @Override
    public String toString() {
        return "Debtor{" +
                "id=" + id +
                ", relatedPerson='" + relatedPersonFullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", finCode='" + finCode + '\'' +
                ", userId=" + userId +
                ", guarantorId=" + guarantorId +
                '}';
    }
}
