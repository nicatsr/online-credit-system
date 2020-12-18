package az.onlinecredit.service.jdbcImpl;

import az.onlinecredit.model.database.Debtor;
import az.onlinecredit.model.database.Guarantor;
import az.onlinecredit.model.dto.DebtorDto;
import az.onlinecredit.repository.DebtorRepository;
import az.onlinecredit.service.DebtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class DebtorServiceImpl implements DebtorService {

    @Autowired
    private DebtorRepository debtorRepository;

    @Transactional
    @Override
    public void addDebtor(DebtorDto debtorDto) {
        Debtor debtor = new Debtor();
        Guarantor guarantor = new Guarantor();
        debtor.setRelatedPersonFullName(debtorDto.getRelatedPersonFullName());
        debtor.setPhoneNumber(debtorDto.getPhoneNumber());
        debtor.setSalary(debtorDto.getSalary());
        debtor.setFinCode(debtorDto.getFinCode());

        guarantor.setFullName(debtorDto.getGuarantorFullName());
        guarantor.setPhoneNumber(debtorDto.getGuarantorPhoneNumber());
        guarantor.setFinCode(debtorDto.getGuarantorFinCode());
        debtorRepository.add(guarantor);
        Guarantor guarantor1 = getGuarantorByFinCode(guarantor.getFinCode());
        debtor.setGuarantorId(guarantor1.getId());

        debtorRepository.addDebtor(debtor);


    }

    @Override
    public Guarantor getGuarantorByFinCode(String finCode) {
        return debtorRepository.getGuarantorByFindCode(finCode);
    }

    @Override
    public Optional<Debtor> getDebtorByFinCode(String finCode) {
        return debtorRepository.getDebtorByFinCode(finCode);
    }


    @Override
    public boolean checkSalary(Debtor debtor, BigDecimal monthlyPayment) {
        BigDecimal salaryPart = debtor.getSalary().multiply(BigDecimal.valueOf(30))
                .divide(BigDecimal.valueOf(100));
        return salaryPart.compareTo(monthlyPayment) > 0;
    }

}
