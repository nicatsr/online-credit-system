//package az.onlinecredit.controller;
//
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@ExtendWith(MockitoExtension.class)
//@WebMvcTest(HealthController.class)
//public class HealthControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void checkHealthTest_whenStatus200(){
//        try {
//            mockMvc.perform(MockMvcRequestBuilders.get("/health")
//                    .accept(MediaType.APPLICATION_JSON))
//                    .andExpect(status().isOk())
//                    .andExpect(content().string("Health controller"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void checkHealthTest_whenStatus404(){
//        try {
//                    mockMvc.perform(MockMvcRequestBuilders.get("/test")
//                    .accept(MediaType.APPLICATION_JSON))
//                    .andExpect(status().is4xxClientError());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
