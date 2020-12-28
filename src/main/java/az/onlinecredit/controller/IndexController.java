package az.onlinecredit.controller;


import az.onlinecredit.model.dto.UserDto;
import az.onlinecredit.repository.UserRepository;
import az.onlinecredit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public ModelAndView getIndex(){
        return new ModelAndView("web/index");
    }

    @GetMapping("login")
    public String login(){
        return "web/login";
    }

}
