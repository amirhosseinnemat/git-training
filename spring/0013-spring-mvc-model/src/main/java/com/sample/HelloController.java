package com.sample;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/")
    public String showHome() {
        return "home-page";
    }

    @RequestMapping("/form")
    public String showForm() {
        return "form-page";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {
        //read the request parameter from html form
        String name = request.getParameter("name");

        //convert the name to upperCase
        name = name.toUpperCase();

        //create message
        String result = String.format("Hello Dear " + name + ", enjoy the trip!");

        //add message to model
        model.addAttribute("message", result);

        return "welcome-page";
    }


    //use @RequestParam instead of HttpServletRequest
    @RequestMapping("/precessFormV2")
    public String processFormV2(@RequestParam("name") String name, Model model){


        //convert the name to upperCase
        name = name.toUpperCase();

        //create message
        String result = String.format("Hello Dear " + name + ", enjoy the trip!(v.2)");

        //add message to model
        model.addAttribute("message", result);

        return "welcome-page";
    }

}
