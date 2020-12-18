package az.onlinecredit.controller;


import az.onlinecredit.model.database.Debtor;
import az.onlinecredit.model.dto.CreditDto;
import az.onlinecredit.model.dto.DebtorDto;
import az.onlinecredit.service.CreditService;
import az.onlinecredit.service.DebtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
@SessionAttributes(names = {"debtor" , "creditDto"})
public class AdminController {

    @GetMapping("/")
    public ModelAndView getIndex() {
        return new ModelAndView("admin/index");
    }

    @GetMapping("/getDebtorForm")
    public ModelAndView getAddDebtor(){
        ModelAndView mav = new ModelAndView("admin/addDebtor");
        DebtorDto debtorDto = new DebtorDto();
        mav.addObject("debtorDto" ,debtorDto);
        return mav;
    }

    @Autowired
    private DebtorService debtorService;

    @PostMapping("/addDebtor")
    public ModelAndView saveDebtor(
            @ModelAttribute("debtorDto") DebtorDto debtorDto
    ){
        ModelAndView mav = new ModelAndView("redirect:/admin/");
        debtorService.addDebtor(debtorDto);
        return mav;
    }

        @GetMapping("/loginWithFinCode")
        public ModelAndView loginWithFinCode(){
            ModelAndView mav = new ModelAndView("admin/loginWithFinCode");
            DebtorDto debtorDto = new DebtorDto();
            mav.addObject("debtorDto" , debtorDto);
            return mav;
        }

        @PostMapping("checkFin")
        public ModelAndView checkFin(
                @ModelAttribute("debtorDto") DebtorDto debtorDto1
        ){
                ModelAndView mav = new ModelAndView();
                Optional<Debtor> optionalDebtor =
                        debtorService.getDebtorByFinCode(debtorDto1.getFinCode());
                if (optionalDebtor.isPresent()){
                    mav.setViewName("admin/creditForm");
                    CreditDto creditDto = new CreditDto();
                    mav.addObject("debtor" ,optionalDebtor.get());
                    creditDto.setFinCode(optionalDebtor.get().getFinCode());
                    mav.addObject("creditDto" , creditDto);
                }else{
                    mav.setViewName("admin/addDebtor");
                    DebtorDto debtorDto = new DebtorDto();
                    mav.addObject("debtorDto" , debtorDto);
                }

                return mav;
        }


        @Autowired
        private CreditService creditService;

        @PostMapping("/checkCredit")
        public ModelAndView saveCredit(
                @ModelAttribute("creditDto") CreditDto creditDto,
                @ModelAttribute("debtor") Debtor debtor
        ){

            ModelAndView mav = new ModelAndView();
            mav.setViewName("admin/creditResult");
            BigDecimal monthlyPayment =
                    creditService.calculateMonthlyPayment(creditDto);
            BigDecimal generalPayment = creditService
                            .calculateGeneralPayment(monthlyPayment ,creditDto.getPeriodWithMonth());
            LocalDate endDate = creditDto.getStartDate().toLocalDate()
                    .plusMonths(creditDto.getPeriodWithMonth());
            boolean salaryResult = debtorService.checkSalary(debtor ,monthlyPayment);
            mav.addObject("salaryResult" , salaryResult);
            mav.addObject("endDate" , endDate);
            mav.addObject("creditDto" , creditDto);
            mav.addObject("monthlyPayment" , monthlyPayment);
            mav.addObject("generalPayment" , generalPayment);
            return mav;
        }

        @GetMapping("/addCredit")
        public void addCredit(
                @ModelAttribute("creditDto") CreditDto creditDto
        ){
            System.out.println(creditDto);
            creditService.addCredit(creditDto);
        }
}
