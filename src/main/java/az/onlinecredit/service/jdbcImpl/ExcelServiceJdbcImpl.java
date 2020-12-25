package az.onlinecredit.service.jdbcImpl;

import az.onlinecredit.model.database.Payment;
import az.onlinecredit.model.dto.ExcelReport;
import az.onlinecredit.service.ExcelService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelServiceJdbcImpl implements ExcelService {
    @Override
    public List<ExcelReport> generateExcel(Payment payment) {
        int month = 1;
        List<ExcelReport> reportList = new ArrayList<>();
        while(payment.getGeneralPayment().compareTo(BigDecimal.ZERO) > 0 &&
                payment.getGeneralPayment().compareTo(payment.getMonthlyPayment()) >= 0){
            ExcelReport report = new ExcelReport();
            report.setMonth(month);
            report.setGeneralPayment(payment.getGeneralPayment());
            report.setMonthlyPayment(payment.getMonthlyPayment());
            reportList.add(report);
            month++;
            payment.setGeneralPayment(payment.getGeneralPayment()
                    .subtract(payment.getMonthlyPayment()));
        }

        return reportList;
    }
}
