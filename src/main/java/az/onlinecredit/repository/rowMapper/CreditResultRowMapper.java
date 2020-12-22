package az.onlinecredit.repository.rowMapper;

import az.onlinecredit.model.database.CreditResult;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CreditResultRowMapper implements RowMapper<CreditResult> {
    @Override
    public CreditResult mapRow(ResultSet rs, int i) throws SQLException {
        CreditResult creditResult = new CreditResult();
        creditResult.setBaseAmount(rs.getBigDecimal("base_amount"));
        creditResult.setInterestRate(rs.getBigDecimal("interest_rate"));
        creditResult.setGeneralPayment(rs.getBigDecimal("general_payment"));
        creditResult.setMonthlyPayment(rs.getBigDecimal("monthly_payment"));
        creditResult.setPeriodWithMonth(rs.getInt("period_with_month"));
        creditResult.setStartDate(rs.getDate("start_date"));
        creditResult.setEndDate(rs.getDate("end_date"));
        creditResult.setFinCode(rs.getString("fin_code"));
        creditResult.setStatus(rs.getInt("status"));
        return creditResult;
    }
}
