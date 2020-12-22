package az.onlinecredit.repository.rowMapper;

import az.onlinecredit.model.database.DebtorResult;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DebtorResultRowMapper implements RowMapper<DebtorResult> {
    @Override
    public DebtorResult mapRow(ResultSet rs, int i) throws SQLException {
        DebtorResult debtorResult = new DebtorResult();
        debtorResult.setRelatedPerson(rs.getString("related_person"));
        debtorResult.setDebtorPhoneNumber(rs.getString("debtor_phone_number"));
        debtorResult.setSalary(rs.getBigDecimal("salary"));
        debtorResult.setDebtorFinCode(rs.getString("debtor_fin_code"));
        debtorResult.setGuarantorFullName(rs.getString("guarantor_name"));
        debtorResult.setGuarantorFinCode(rs.getString("guarantor_fin_code"));
        debtorResult.setGuarantorPhoneNumber(rs.getString("guarantor_phone_number"));
        return debtorResult;
    }
}
