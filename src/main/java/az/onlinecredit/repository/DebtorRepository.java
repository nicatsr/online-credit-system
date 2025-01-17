package az.onlinecredit.repository;

import az.onlinecredit.model.database.Debtor;
import az.onlinecredit.model.database.DebtorResult;
import az.onlinecredit.model.database.Guarantor;

import java.util.Optional;

public interface DebtorRepository {

    void add(Guarantor guarantor);

    Guarantor getGuarantorByFindCode(String finCode);

    void addDebtor(Debtor debtor);

    Optional<Debtor> getDebtorByFinCode(String finCode);

    Optional<DebtorResult> getDebtorResultByFinCode(String finCode);

    boolean checkGuarantorExists(String finCode);


    boolean checkCustomerExists(String finCode);
}
