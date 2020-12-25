package az.onlinecredit.controller.rest;

import az.onlinecredit.controller.HealthController;
import az.onlinecredit.model.database.CreditResult;
import az.onlinecredit.service.CreditService;
import az.onlinecredit.service.DebtorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(HealthController.class)
public class SearchRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CreditService creditService;

    @MockBean
    private DebtorService debtorService;

    @BeforeEach
    private void setup(){
        List<CreditResult> list = new ArrayList<>();
        list.add(new CreditResult(BigDecimal.valueOf(5000) , BigDecimal.valueOf(4) ,BigDecimal.valueOf(500000) ,
                BigDecimal.valueOf(450) , 360 ,new Date(2000) , new Date(2000), "12345" , 1));
        when(creditService.getCreditResultList()).thenReturn(list);
    }

    @Test
    public void getCreditResultListTest(){
        try {

            MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/result/list")
            .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(forwardedUrl("http:/localhost:8080/result/list"))
                    .andReturn();
            assertEquals(creditService.getCreditResultList() ,result);
            verify(creditService.getCreditResultList() , times(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
