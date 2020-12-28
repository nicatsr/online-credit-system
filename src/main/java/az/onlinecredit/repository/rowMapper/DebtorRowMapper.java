package az.onlinecredit.repository.rowMapper;

import az.onlinecredit.model.database.Debtor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DebtorRowMapper implements RowMapper<Debtor> {
    @Override
    public Debtor mapRow(ResultSet rs, int i) throws SQLException {
        Debtor debtor = new Debtor();
        debtor.setId(rs.getLong("id"));
        debtor.setRelatedPersonFullName(rs.getString("related_person"));
        debtor.setPhoneNumber(rs.getString("phone_number"));
        debtor.setSalary(rs.getBigDecimal("salary"));
        debtor.setFinCode(rs.getString("fin_code"));
        debtor.setGuarantorId(rs.getLong("guarantor_id"));
        return debtor;
    }
}
