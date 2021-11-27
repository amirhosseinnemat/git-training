package com.sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan("com.sample")
public class HomeController {

    @RequestMapping("/")
    public String showHome(){
        return "index";
    }

    @RequestMapping("/showForm")
    public String showForm(Model model){

        // create student object
        Student theStudent = new Student();

        // add student to the model
        model.addAttribute("student",theStudent);

        return "form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        System.out.println(theStudent.getFirstName());
        System.out.printf(theStudent.getCountry());
        return "result";
    }
}
