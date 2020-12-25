package az.onlinecredit.model.database;

import java.math.BigDecimal;
import java.sql.Date;

public class CreditResult {

    private BigDecimal baseAmount;

    private BigDecimal interestRate;

    private BigDecimal generalPayment;

    private BigDecimal monthlyPayment;

    private int periodWithMonth;

    private Date startDate;

    private Date endDate;

    private String finCode;

    private int status;

    public CreditResult() {
    }

    public CreditResult(BigDecimal baseAmount, BigDecimal interestRate, BigDecimal generalPayment, BigDecimal monthlyPayment, int periodWithMonth, Date startDate, Date endDate, String finCode, int status) {
        this.baseAmount = baseAmount;
        this.interestRate = interestRate;
        this.generalPayment = generalPayment;
        this.monthlyPayment = monthlyPayment;
        this.periodWithMonth = periodWithMonth;
        this.startDate = startDate;
        this.endDate = endDate;
        this.finCode = finCode;
        this.status = status;
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CreditResult{" +
                "baseAmount=" + baseAmount +
                ", interestRate=" + interestRate +
                ", generalPayment=" + generalPayment +
                ", monthlyPayment=" + monthlyPayment +
                ", periodWithMonth=" + periodWithMonth +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", finCode='" + finCode + '\'' +
                ", status=" + status +
                '}';
    }
}
