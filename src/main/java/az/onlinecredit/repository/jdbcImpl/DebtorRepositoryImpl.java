package az.onlinecredit.repository.jdbcImpl;

import az.onlinecredit.model.database.Debtor;
import az.onlinecredit.model.database.Guarantor;
import az.onlinecredit.repository.DebtorRepository;
import az.onlinecredit.repository.rowMapper.DebtorRowMapper;
import az.onlinecredit.repository.rowMapper.GuarantorRowMapper;
import az.onlinecredit.repository.sql.DebtorSql;
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
                DebtorSql.GET_GUARANTOR_BY_FIN_CODE ,args , guarantorRowMapper);
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
                jdbcTemplate.query(DebtorSql.GET_DEBTOR_BY_FIN_CODE , args , debtorRowMapper);
        if (!list.isEmpty()){
            optionalDebtor = Optional.of(list.get(0));
        }
        return optionalDebtor;
    }
}
