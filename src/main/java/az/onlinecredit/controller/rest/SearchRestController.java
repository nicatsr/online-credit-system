package az.onlinecredit.controller.rest;

import az.onlinecredit.model.database.CreditResult;
import az.onlinecredit.model.database.DebtorResult;
import az.onlinecredit.service.CreditService;
import az.onlinecredit.service.DebtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/result")
public class SearchRestController {

    @Autowired
    private CreditService creditService;

    @Autowired
    private DebtorService debtorService;

    @GetMapping("/list")
    public List<CreditResult> getCreditResultList(){
        return creditService.getCreditResultList();
    }

    @GetMapping("debtorResult/{finCode}")
    public DebtorResult getDebtorResultByFinCode(
            @PathVariable(name = "finCode") String finCode
    ){
        Optional<DebtorResult> optionalDebtorResult = debtorService.getDebtorResultByFinCode(finCode);
        DebtorResult debtorResult = null;
        if (optionalDebtorResult.isPresent()){
            debtorResult = optionalDebtorResult.get();
        }

        return debtorResult;
    }

    @GetMapping("creditResult/{finCode}")
    public CreditResult getCreditResult(
            @PathVariable(name = "finCode") String finCode
    ){
        Optional<CreditResult> optionalCreditResult = creditService.getCreditResultByFinCode(finCode);
        CreditResult creditResult = null;
        if (optionalCreditResult.isPresent()) {
            creditResult = optionalCreditResult.get();
        }

        return creditResult;

    }
}
