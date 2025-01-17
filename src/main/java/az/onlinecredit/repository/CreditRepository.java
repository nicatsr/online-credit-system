package az.onlinecredit.repository;

import az.onlinecredit.model.database.Credit;
import az.onlinecredit.model.database.CreditResult;
import az.onlinecredit.model.database.Payment;

import java.util.List;
import java.util.Optional;

public interface CreditRepository {
    void addCredit(Credit credit);

    Optional<Credit> getCreditByFinCode(String finCode);

    void addPayment(Payment payment);

    List<CreditResult> getCreditResultList();

    Optional<CreditResult> getCreditResultByFinCode(String finCode);

}
