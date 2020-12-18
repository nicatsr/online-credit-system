package az.onlinecredit.model.database;

import java.math.BigDecimal;

public class Payment {
    private long id;

    private BigDecimal generalPayment;

    private BigDecimal monthlyPayment;

    private long creditId;

    private String finCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getGeneralPayment() {
        return generalPayment;
    }

    public void setGeneralPayment(BigDecimal generalPayment) {
        this.generalPayment = generalPayment;
    }

    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public long getCreditId() {
        return creditId;
    }

    public void setCreditId(long creditId) {
        this.creditId = creditId;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", generalPayment=" + generalPayment +
                ", monthlyPayment=" + monthlyPayment +
                ", creditId=" + creditId +
                ", finCode='" + finCode + '\'' +
                '}';
    }
}
