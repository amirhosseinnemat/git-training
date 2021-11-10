package com.sample;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String main(){
        return "main-page";
    }

    @RequestMapping("/form")
    public String showForm() {
        return "form-page";
    }

    @RequestMapping("/welcome")
    public String showWelcome() {
        return "welcome-page";
    }
}
