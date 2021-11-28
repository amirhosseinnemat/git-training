package com.sample;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@ComponentScan("com.sample")
public class HomeController {

    // add an init binder to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/")
    public String showHome() {
        return "index";
    }

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        // create student object
        Student theStudent = new Student();

        // add student to the model
        model.addAttribute("student", theStudent);

        return "form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult) {
        System.out.println(theStudent.getFirstName());
        System.out.printf(theStudent.getCountry());

        if (bindingResult.hasErrors()) {
            return "form";
        } else {
            return "result";
        }

    }
}
