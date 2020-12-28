package az.onlinecredit.repository.jdbcImpl;

import az.onlinecredit.model.database.Debtor;
import az.onlinecredit.model.database.DebtorResult;
import az.onlinecredit.model.database.Guarantor;
import az.onlinecredit.repository.DebtorRepository;
import az.onlinecredit.repository.rowMapper.DebtorResultRowMapper;
import az.onlinecredit.repository.rowMapper.DebtorRowMapper;
import az.onlinecredit.repository.rowMapper.GuarantorRowMapper;
import az.onlinecredit.repository.sql.DebtorSql;
import az.onlinecredit.repository.sql.UserSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DebtorRepositoryImpl implements DebtorRepository {


    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void add(Guarantor guarantor) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("full_name" ,guarantor.getFullName());
        parameterSource.addValue("fin_code" , guarantor.getFinCode());
        parameterSource.addValue("phone_number" , guarantor.getPhoneNumber());
        int count = namedParameterJdbcTemplate.update(DebtorSql.ADD_GUARANTOR,parameterSource);
        if (count < 1){
            throw new RuntimeException("error adding guarantor");
        }

    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private GuarantorRowMapper guarantorRowMapper;

    @Override
    public Guarantor getGuarantorByFindCode(String finCode) {
        Guarantor guarantor = new Guarantor();
        Object[] args = new Object[]{finCode};
        List<Guarantor> list =jdbcTemplate.query(
                DebtorSql.GET_GUARANTOR_BY_FIN_CODE , guarantorRowMapper , args);
        if (!list.isEmpty()){
            return list.get(0);
        }
        return null;
    }

    @Override
    public void addDebtor(Debtor debtor) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("related_person" , debtor.getRelatedPersonFullName());
        parameterSource.addValue("phone_number" ,debtor.getPhoneNumber());
        parameterSource.addValue("salary" ,debtor.getSalary());
        parameterSource.addValue("fin_code" ,debtor.getFinCode());
        parameterSource.addValue("guarantor_id" ,debtor.getGuarantorId());

        int count = namedParameterJdbcTemplate.update(DebtorSql.ADD_DEBTOR ,parameterSource);
        if (count < 1){
            throw new RuntimeException("error adding debtor");
        }
    }

    @Autowired
    private DebtorRowMapper debtorRowMapper;

    @Override
    public Optional<Debtor> getDebtorByFinCode(String finCode) {
        Optional<Debtor> optionalDebtor = Optional.empty();
        Object[] args = new Object[]{finCode};
        List<Debtor> list =
                jdbcTemplate.query(DebtorSql.GET_DEBTOR_BY_FIN_CODE , debtorRowMapper , args);
        if (!list.isEmpty()){
            optionalDebtor = Optional.of(list.get(0));
        }
        return optionalDebtor;
    }

    @Autowired
    private DebtorResultRowMapper debtorResultRowMapper;

    @Override
    public Optional<DebtorResult> getDebtorResultByFinCode(String finCode) {
        Optional<DebtorResult> optionalDebtorResult = Optional.empty();
        Object[] args = new Object[]{finCode};
        List<DebtorResult> list =
                jdbcTemplate.query(DebtorSql.GET_DEBTOR_RESULT_BY_FIN_CODE ,debtorResultRowMapper , args);
        if (!list.isEmpty()){
            optionalDebtorResult = Optional.of(list.get(0));
        }
        return optionalDebtorResult;
    }

    @Override
    public boolean checkGuarantorExists(String finCode) {
        boolean isEmailExist = false;
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("fin_code", finCode);
        int count = namedParameterJdbcTemplate.queryForObject(DebtorSql.CHECK_GUARANTOR_EXISTS, mapSqlParameterSource, Integer.class);
        if (count > 0){
            isEmailExist = true;
        }
        return isEmailExist;

    }

    @Override
    public boolean checkCustomerExists(String finCode) {
        boolean isEmailExist = false;
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("fin_code", finCode);
        int count = namedParameterJdbcTemplate.queryForObject(DebtorSql.CHECK_CUSTOMER_EXISTS, mapSqlParameterSource, Integer.class);
        if (count > 0){
            isEmailExist = true;
        }
        return isEmailExist;
    }
}
