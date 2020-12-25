package az.onlinecredit.model.dto;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.sql.Date;

public class CreditDto {

    @NotNull(message = "{credit.amount.notnull}")
    @Min(value = 15000 , message = "{credit.amount.min}") @Max(value = 150_000 , message = "{credit.amount.max}")
    @Positive(message = "{credit.amount.positive}")
    private BigDecimal baseAmount;

    @NotNull(message = "{credit.interestRate.notnull}")
    @Min(value =4 , message = "{credit.interestRate.min}") @Max(value =8 , message = "{credit.interestRate.max}")
    @Positive(message = "{credit.interestRate.positive}")
    private BigDecimal interestRate;

    @NotNull(message = "{credit.periodWithMonth.notnull}")
    @Min(value = 36 ,message = "{credit.periodWithMonth.min}") @Max(value = 360 , message = "{credit.periodWithMonth.max}")
    @Positive(message = "{credit.periodWithMonth.positive}")
    private Integer periodWithMonth;


    private Date startDate;

    @NotNull(message = "{credit.finCode.notnull}")
    @Size(min = 7, max = 7 ,message = "{credit.finCode.size}")
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

    public Integer getPeriodWithMonth() {
        return periodWithMonth;
    }

    public void setPeriodWithMonth(Integer periodWithMonth) {
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
