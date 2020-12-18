package az.onlinecredit.model.database;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Credit {

    private long id;

    private BigDecimal baseAmount;

    private BigDecimal interestRate;

    private int periodWithMonth;

    private LocalDate startDate;

    private LocalDate endDate;

    private String finCode;

    private int status;

    public Credit() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
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
        return "Credit{" +
                "id=" + id +
                ", baseAmount=" + baseAmount +
                ", interestRate=" + interestRate +
                ", periodWithMonth=" + periodWithMonth +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", finCode='" + finCode + '\'' +
                ", status=" + status +
                '}';
    }
}
