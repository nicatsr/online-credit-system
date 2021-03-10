package az.onlinecredit.view;

import az.onlinecredit.model.dto.ExcelReport;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class MortgageExcelView extends AbstractXlsView {
    @Override
    protected void buildExcelDocument(Map<String, Object> map,
                                      Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION
                , "attachment; filename=\"payment.xls\"");
                List<ExcelReport> list = (List<ExcelReport>) map.get("reportList");

                Sheet sheet = workbook.createSheet("payment");
                Row header = sheet.createRow(0);

                header.createCell(0).setCellValue("Ay");
                header.createCell(1).setCellValue("Qalıq borc");
                header.createCell(2).setCellValue("Aylıq ödəniş");

                for (int i = 0; i < 3; i++) {
                    sheet.autoSizeColumn(i);
                }
                int index = 1;
                for(ExcelReport report : list){
                    Row row = sheet.createRow(index++);
                    row.createCell(0).setCellValue(report.getMonth());
                    row.createCell(1).setCellValue(report.getGeneralPayment().toString());
                    row.createCell(2).setCellValue(report.getMonthlyPayment().toString());
                }

                workbook.close();
                workbook.write(response.getOutputStream());

    }
}
