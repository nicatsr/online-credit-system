package az.onlinecredit.repository.rowMapper;

import az.onlinecredit.model.database.Credit;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CreditRowMapper implements RowMapper<Credit> {

    @Override
    public Credit mapRow(ResultSet rs, int i) throws SQLException {
        Credit credit = new Credit();
        credit.setId(rs.getLong("id"));
        credit.setBaseAmount(rs.getBigDecimal("base_amount"));
        credit.setInterestRate(rs.getBigDecimal("interest_rate"));
        credit.setPeriodWithMonth(rs.getInt("period_with_month"));
        credit.setStartDate(rs.getDate("start_date").toLocalDate());
        credit.setEndDate(rs.getDate("end_date").toLocalDate());
        credit.setStatus(rs.getInt("status"));
        credit.setFinCode(rs.getString("fin_code"));
        return credit;
    }
}
