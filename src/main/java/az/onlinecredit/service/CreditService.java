package az.onlinecredit.service;

import az.onlinecredit.model.database.Credit;
import az.onlinecredit.model.database.Payment;
import az.onlinecredit.model.dto.CreditDto;

import java.math.BigDecimal;
import java.util.Optional;

public interface CreditService {
    BigDecimal calculateMonthlyPayment(CreditDto creditDto);

    BigDecimal calculateGeneralPayment(BigDecimal monthlyPayment , int period);

    void addCredit(CreditDto creditDto);

    Optional<Credit> getCreditByFinCode(String finCode);

    void addPayment(Payment payment);




}
