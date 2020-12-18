package az.onlinecredit.repository;

import az.onlinecredit.model.database.Debtor;
import az.onlinecredit.model.database.Guarantor;

import java.util.Optional;

public interface DebtorRepository {

    void add(Guarantor guarantor);

    Guarantor getGuarantorByFindCode(String finCode);

    void addDebtor(Debtor debtor);

    Optional<Debtor> getDebtorByFinCode(String finCode);











}
