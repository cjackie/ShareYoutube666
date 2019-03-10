package com.chaojie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWord {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("name", name != null ? name : "");
        return "hello";
    }

}
