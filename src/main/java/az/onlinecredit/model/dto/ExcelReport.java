package az.onlinecredit.model.dto;

import java.math.BigDecimal;

public class ExcelReport {
    int month;
    BigDecimal generalPayment;
    BigDecimal monthlyPayment;

    public ExcelReport(int month, BigDecimal generalPayment, BigDecimal monthlyPayment) {
        this.month = month;
        this.generalPayment = generalPayment;
        this.monthlyPayment = monthlyPayment;
    }

    public ExcelReport() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
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

    @Override
    public String toString() {
        return "ExcelReport{" +
                "month=" + month +
                ", generalPayment=" + generalPayment +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}
