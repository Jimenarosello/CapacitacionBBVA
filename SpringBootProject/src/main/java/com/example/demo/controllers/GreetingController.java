package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping
    public String greet(@RequestParam(required = false, defaultValue = "mundo", name = "name") String name,
            Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
