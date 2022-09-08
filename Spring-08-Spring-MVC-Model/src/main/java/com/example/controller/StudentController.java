package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {


    @RequestMapping("welcome")
    public String homePage(Model model) {

        // model methods
        model.addAttribute("name", "Nijad");
        model.addAttribute("course", "MVC");

        // create some random student id(0-1000)
        int d = new Random().nextInt();
        model.addAttribute("d", d);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(10);
        model.addAttribute("numbers", numbers);
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
