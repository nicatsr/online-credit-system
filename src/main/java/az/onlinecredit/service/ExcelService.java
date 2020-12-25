package az.onlinecredit.service;

import az.onlinecredit.model.database.Payment;
import az.onlinecredit.model.dto.ExcelReport;

import java.util.List;

public interface ExcelService {

    List<ExcelReport> generateExcel(Payment payment);
}
