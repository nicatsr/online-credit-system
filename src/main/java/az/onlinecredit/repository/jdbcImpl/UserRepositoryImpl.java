package az.onlinecredit.repository.jdbcImpl;

import az.onlinecredit.model.Role;
import az.onlinecredit.model.database.User;
import az.onlinecredit.model.database.UserRole;
import az.onlinecredit.repository.UserRepository;
import az.onlinecredit.repository.rowMapper.UserRowMapper;
import az.onlinecredit.repository.sql.UserSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public boolean checkEmailExist(String email) {
        boolean isEmailExist = false;
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("email", email);
        int count = namedParameterJdbcTemplate.queryForObject(UserSql.CHECK_EMAIL_EXIST, mapSqlParameterSource, Integer.class);
        if (count > 0) {
            isEmailExist = true;
        }
        return isEmailExist;
    }

    @Override
    public void addUser(User user) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("full_name" , user.getFullName());
        parameterSource.addValue("email" , user.getEmail());
        parameterSource.addValue("password" , user.getPassword());
        parameterSource.addValue("registration_date" , user.getRegistrationDate());
        int count = namedParameterJdbcTemplate.update(UserSql.ADD_USER , parameterSource);
        if (count < 1){
            throw new RuntimeException("error adding user");
        }

    }

    @Override
    public void addUserRole(UserRole userRole) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("user_id" , userRole.getUserId());
        parameterSource.addValue("role_id" , userRole.getRoleId());
        int count = namedParameterJdbcTemplate.update(UserSql.ADD_USER_ROLE ,parameterSource);
        if (count < 1){
            throw new RuntimeException("error adding user role");
        }
    }
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserRowMapper userRowMapper;


    @Override
    public Optional<User> getUserByEmail(String email) {
        Optional<User> optionalUser = Optional.empty();
        MapSqlParameterSource params = new MapSqlParameterSource("email", email);
        List<User> list = namedParameterJdbcTemplate.query(UserSql.GET_USER_BY_EMAIL ,params, userRowMapper );
        if (!list.isEmpty()){
            optionalUser = Optional.of(list.get(0));
        }

        return optionalUser;
    }


    @Override
    public List<Role> getUserRoles(long id) {
        MapSqlParameterSource params = new MapSqlParameterSource("user_id", id);
        List<Role> roles = namedParameterJdbcTemplate.query(UserSql.GET_USER_ROLES
                , params, (rs, i) -> Role.fromValue(rs.getInt("role_id")));
        return roles;
    }
}
