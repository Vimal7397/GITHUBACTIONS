package com.example.TEST;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to Thymeleaf");
        model.addAttribute("items", List.of("Java", "Spring Boot", "Thymeleaf"));
        return "home";   // resolves to templates/home.html
    }

    @PostMapping("/greet")
    public String greet(@RequestParam String name, Model model) {
        model.addAttribute("message", "Hello, " + name + "!");
        return "greet";  // resolves to templates/greet.html
    }
}