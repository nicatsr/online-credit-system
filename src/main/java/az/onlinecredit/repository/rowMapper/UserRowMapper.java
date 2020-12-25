package az.onlinecredit.repository.rowMapper;

import az.onlinecredit.model.database.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setFullName(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword("password");
        user.setRegistrationDate(rs.getDate("registration_date"));
        return user;
    }
}
