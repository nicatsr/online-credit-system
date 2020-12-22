package az.onlinecredit.repository.jdbcImpl;

import az.onlinecredit.model.database.Credit;
import az.onlinecredit.model.database.CreditResult;
import az.onlinecredit.model.database.Payment;
import az.onlinecredit.repository.CreditRepository;
import az.onlinecredit.repository.rowMapper.CreditResultRowMapper;
import az.onlinecredit.repository.rowMapper.CreditRowMapper;
import az.onlinecredit.repository.sql.CreditSql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CreditRepositoryImpl implements CreditRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public void addCredit(Credit credit) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("base_amount" , credit.getBaseAmount());
        parameterSource.addValue("interest_rate" , credit.getInterestRate());
        parameterSource.addValue("period_with_month" , credit.getPeriodWithMonth());
        parameterSource.addValue("start_date" , credit.getStartDate());
        parameterSource.addValue("end_date" , credit.getEndDate());
        parameterSource.addValue("status" , credit.getStatus());
        parameterSource.addValue("fin_code" , credit.getFinCode());

        int count = namedParameterJdbcTemplate.update(CreditSql.ADD_CREDIT ,parameterSource);
        if (count < 1){
            throw new RuntimeException("error adding credit");
        }

    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CreditRowMapper creditRowMapper;

    @Override
    public Optional<Credit> getCreditByFinCode(String finCode) {
        Optional<Credit> optionalCredit = Optional.empty();
        Object[] args = new Object[]{finCode};
        List<Credit> list =
                jdbcTemplate.query(CreditSql.GET_CREDIT_BY_FIN_CODE , creditRowMapper , args);

        if (!list.isEmpty()){
            optionalCredit = Optional.of(list.get(0));
        }
        return optionalCredit;
    }

    @Override
    public void addPayment(Payment payment) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("general_payment" , payment.getGeneralPayment());
        parameterSource.addValue("monthly_payment" , payment.getMonthlyPayment());
        parameterSource.addValue("credit_id" , payment.getCreditId());
        parameterSource.addValue("fin_code" , payment.getFinCode());

        int count = namedParameterJdbcTemplate.update(CreditSql.ADD_PAYMENT ,parameterSource);
        if (count < 1){
            throw new RuntimeException("error adding payment");
        }
    }

    @Autowired
    private CreditResultRowMapper creditResultRowMapper;

    @Override
    public List<CreditResult> getCreditResultList() {
        return jdbcTemplate.query(CreditSql.GET_CREDIT_RESULT_LIST, creditResultRowMapper);
    }

    @Override
    public Optional<CreditResult> getCreditResultByFinCode(String finCode) {
        Optional<CreditResult> optionalCreditResult = Optional.empty();
        Object[] args = new Object[]{finCode};
        List<CreditResult> list =
                jdbcTemplate.query(CreditSql.GET_CREDIT_RESULT_BY_FIN_CODE , creditResultRowMapper ,args);
        if (!list.isEmpty()){
            optionalCreditResult = Optional.of(list.get(0));
        }
        return optionalCreditResult;
    }
}
