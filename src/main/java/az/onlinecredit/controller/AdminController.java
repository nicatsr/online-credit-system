package az.onlinecredit.controller;


import az.onlinecredit.model.database.Debtor;
import az.onlinecredit.model.database.Payment;
import az.onlinecredit.model.dto.CreditDto;
import az.onlinecredit.model.dto.DebtorDto;
import az.onlinecredit.model.dto.ExcelReport;
import az.onlinecredit.service.CreditService;
import az.onlinecredit.service.DebtorService;
import az.onlinecredit.service.ExcelService;
import az.onlinecredit.view.MortgageExcelView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = {"/adminUser" , "/adminUser/"})
@SessionAttributes(names = {"debtor" , "creditDto" , "payment"})
public class AdminController {
    @Autowired
    private CreditService creditService;


    @Autowired
    private DebtorService debtorService;

    @Autowired
    private ExcelService excelService;

    @GetMapping
    public ModelAndView getIndex() {
        return new ModelAndView("admin/index");
    }

    @GetMapping("/getDebtorForm")
    public ModelAndView getAddDebtor(){
        ModelAndView mav = new ModelAndView("admin/admin-add-debtor");
        DebtorDto debtorDto = new DebtorDto();
        mav.addObject("debtorDto" ,debtorDto);
        return mav;
    }


    @PostMapping("/addDebtor")
    public ModelAndView saveDebtor(
            @ModelAttribute("debtorDto")@Valid DebtorDto debtorDto ,
            BindingResult br
    ){
        ModelAndView mav = new ModelAndView("redirect:/admin/");
        if (br.hasErrors()){
            mav.setViewName("admin/admin-add-debtor");
        }else{
            debtorService.addDebtor(debtorDto);
        }
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
                    mav.setViewName("admin/creditFormAdmin");
                    CreditDto creditDto = new CreditDto();
                    mav.addObject("debtor" ,optionalDebtor.get());
                    creditDto.setFinCode(optionalDebtor.get().getFinCode());
                    mav.addObject("creditDto" , creditDto);
                }else{
                    mav.setViewName("admin/loginWithFinCode");
                    String message = "Fine uygun istifadechi tapilmadi , yeni istifadechi elave edin";
                    mav.addObject("message" , message);
                }

                return mav;
        }




        @PostMapping("/checkCredit")
        public ModelAndView saveCredit(
                @ModelAttribute("debtor") Debtor debtor ,
                @ModelAttribute("creditDto")@Valid CreditDto creditDto,
                BindingResult br
                ){

            ModelAndView mav = new ModelAndView();
            if (br.hasErrors()){
                mav.setViewName("admin/creditFormAdmin");
            }else{
                mav.setViewName("admin/adminCreditResult");
                BigDecimal monthlyPayment =
                        creditService.calculateMonthlyPayment(creditDto);
                BigDecimal generalPayment = creditService
                        .calculateGeneralPayment(monthlyPayment ,creditDto.getPeriodWithMonth());
                LocalDate endDate = creditDto.getStartDate().toLocalDate()
                        .plusMonths(creditDto.getPeriodWithMonth());
                boolean salaryResult = debtorService.checkSalary(debtor ,monthlyPayment);
                Payment payment = new Payment();
                payment.setMonthlyPayment(monthlyPayment);
                payment.setGeneralPayment(generalPayment);
                mav.addObject("salaryResult" , salaryResult);
                mav.addObject("endDate" , endDate);
                mav.addObject("creditDto" , creditDto);
                mav.addObject("payment" , payment);
            }

            return mav;
        }

    @GetMapping("/addCredit")
    public ModelAndView addCredit(
            @ModelAttribute("creditDto") CreditDto creditDto
    ){
        ModelAndView mav = new ModelAndView("redirect:/admin/");
        creditService.addCredit(creditDto);
        return mav;
    }

        @GetMapping("/excel")
    public ModelAndView generateExcel(
            @ModelAttribute("payment") Payment payment
        ){
            ModelAndView mav = new ModelAndView(new MortgageExcelView());
            List<ExcelReport> list = excelService.generateExcel(payment);
            mav.addObject("reportList" , list);

            return mav;

        }
}
