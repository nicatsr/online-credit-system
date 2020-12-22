package az.onlinecredit.service.jdbcImpl;

import az.onlinecredit.model.database.Credit;
import az.onlinecredit.model.database.CreditResult;
import az.onlinecredit.model.database.Payment;
import az.onlinecredit.model.dto.CreditDto;
import az.onlinecredit.repository.CreditRepository;
import az.onlinecredit.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Optional;

@Service
public class CreditServiceImpl implements CreditService {

    /* mortgage monthly formula
     *
     * monthly payment = principal * r * (1 + r)^N/(1 + r)^N - 1
     * principal is base amount that I want to borrow
     * r = interest rate/100/12
     * N is period of payment with month
     *
     *
     * */

    @Override
    public BigDecimal calculateMonthlyPayment(CreditDto creditDto) {
        BigDecimal r = creditDto.getInterestRate().divide(BigDecimal.valueOf(1200), 5 , RoundingMode.HALF_UP);
        BigDecimal upScope = BigDecimal.ONE.add(r); // (1+r)
        BigDecimal upScopeCons = BigDecimal.ONE.add(r); // upScope changes every time
        // (1 + r)^ N
        for (int i = 0; i < creditDto.getPeriodWithMonth(); i++){
            upScope = upScope.multiply(upScopeCons);
        }
        BigDecimal up = r.multiply(upScope);
        BigDecimal down = upScope.subtract(BigDecimal.ONE);
        BigDecimal result = creditDto.getBaseAmount().multiply(up).divide(down , 2 , RoundingMode.HALF_UP);
        return result;

    }

    @Override
    public BigDecimal calculateGeneralPayment(BigDecimal monthlyPayment , int period) {
        return monthlyPayment.multiply(BigDecimal.valueOf(period));
    }

    @Autowired
    private CreditRepository creditRepository;

    @Transactional
    @Override
    public void addCredit(CreditDto creditDto) {
        // todo means
        Credit credit = new Credit();
        credit.setBaseAmount(creditDto.getBaseAmount());
        credit.setInterestRate(creditDto.getInterestRate());
        credit.setPeriodWithMonth(creditDto.getPeriodWithMonth());
        credit.setStartDate(creditDto.getStartDate().toLocalDate());
        credit.setEndDate(creditDto.getStartDate().toLocalDate()
                .plusMonths(creditDto.getPeriodWithMonth()));
        credit.setFinCode(creditDto.getFinCode());
        credit.setStatus(1);

        creditRepository.addCredit(credit);

        Optional<Credit> optionalCredit =
                getCreditByFinCode(credit.getFinCode());
        Credit creditFromDb = new Credit();
        if (optionalCredit.isPresent()){
             creditFromDb = optionalCredit.get();
        }
        Payment payment = new Payment();
        BigDecimal mP = calculateMonthlyPayment(creditDto);
        payment.setMonthlyPayment(mP);
        payment.setGeneralPayment(calculateGeneralPayment(mP ,creditFromDb.getPeriodWithMonth()));
        payment.setCreditId(creditFromDb.getId());
        payment.setFinCode(creditFromDb.getFinCode());
        addPayment(payment);
    }

    @Override
    public Optional<Credit> getCreditByFinCode(String finCode) {
        return creditRepository.getCreditByFinCode(finCode);
    }

    @Override
    public void addPayment(Payment payment) {
        creditRepository.addPayment(payment);
    }

    @Override
    public List<CreditResult> getCreditResultList() {
        return creditRepository.getCreditResultList();
    }

    @Override
    public Optional<CreditResult> getCreditResultByFinCode(String finCode) {
        return creditRepository.getCreditResultByFinCode(finCode);
    }
}
