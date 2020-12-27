package az.onlinecredit.controller;


import az.onlinecredit.model.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView getIndex(){

        return new ModelAndView("web/index");
    }

    @GetMapping("login")
    public String login(){
        return "web/login";
    }

}
