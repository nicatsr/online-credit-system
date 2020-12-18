package az.onlinecredit.model.dto;

import java.math.BigDecimal;
import java.sql.Date;

public class CreditDto {

    private BigDecimal baseAmount;

    private BigDecimal interestRate;

    private int periodWithMonth;

    private Date startDate;

    private String finCode;

    public CreditDto() {
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public int getPeriodWithMonth() {
        return periodWithMonth;
    }

    public void setPeriodWithMonth(int periodWithMonth) {
        this.periodWithMonth = periodWithMonth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    @Override
    public String toString() {
        return "CreditDto{" +
                "baseAmount=" + baseAmount +
                ", interestRate=" + interestRate +
                ", periodWithMonth=" + periodWithMonth +
                ", startDate=" + startDate +
                ", finCode='" + finCode + '\'' +
                '}';
    }
}
