package com.validation.sample;


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
@ComponentScan("com.validation.sample")
public class HomeController {


    // add an init binder to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    // controller method for index page
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    // controller method for student-form
    @RequestMapping("/form")
    public String showForm(Model model) {

        Student student = new Student();
        model.addAttribute("student", student);

        return "student-form";
    }

    // controller for processing form
    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "student-form";
        } else {
            return "confirm-page";
        }
    }
}
