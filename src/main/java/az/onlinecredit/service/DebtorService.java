package az.onlinecredit.service;

import az.onlinecredit.model.database.Debtor;
import az.onlinecredit.model.database.Guarantor;
import az.onlinecredit.model.dto.DebtorDto;

import java.math.BigDecimal;
import java.util.Optional;

public interface DebtorService {
    void addDebtor(DebtorDto debtorDto);

    Guarantor getGuarantorByFinCode(String finCode);

    Optional<Debtor> getDebtorByFinCode(String finCode);

    boolean checkSalary(Debtor debtor, BigDecimal monthlyPayment);


}
