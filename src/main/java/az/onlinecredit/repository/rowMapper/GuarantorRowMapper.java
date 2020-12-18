package az.onlinecredit.repository.rowMapper;

import az.onlinecredit.model.database.Guarantor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class GuarantorRowMapper implements RowMapper<Guarantor> {
    @Override
    public Guarantor mapRow(ResultSet rs, int i) throws SQLException {
       Guarantor guarantor = new Guarantor();
       guarantor.setId(rs.getLong("id"));
       guarantor.setFullName(rs.getString("full_name"));
       guarantor.setPhoneNumber(rs.getString("phone_number"));
       guarantor.setFinCode(rs.getString("fin_code"));
        return guarantor;
    }
}
