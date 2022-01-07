package com.example.restsample;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.List;

@Controller
@RequestMapping("/person")
public class HomeController {

    Person person = new Person();

    @GetMapping
    @ResponseBody
    public List<String> showRest(){

        return person.persons;
    }
}
