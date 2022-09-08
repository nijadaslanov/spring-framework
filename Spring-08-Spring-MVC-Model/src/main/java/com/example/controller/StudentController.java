package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {


    @RequestMapping("welcome")
    public String homePage(Model model) {

        // model methods
        model.addAttribute("name", "Nijad");
        model.addAttribute("course","MVC");


        return "student/welcome";
    }
//
//    @RequestMapping("/nijad")
//    public String homePage2(Model model) {
//
//
//        return "student/welcome";
//    }


}
