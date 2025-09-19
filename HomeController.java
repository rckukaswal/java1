package com.example.mywebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.mywebsite.service.GreetingService;

@Controller
public class HomeController {
    
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("pageTitle", "मुख पृष्ठ - मेरी वेबसाइट");
        model.addAttribute("welcomeMessage", "हमारी वेबसाइट में आपका स्वागत है");
        return "index";
    }

    @GetMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("pageTitle", "हमारे बारे में");
        model.addAttribute("companyName", "टेक सॉल्यूशंस इंडिया");
        return "about";
    }

    @GetMapping("/contact")
    public String contactPage(Model model) {
        model.addAttribute("pageTitle", "संपर्क करें");
        model.addAttribute("email", "contact@example.com");
        model.addAttribute("phone", "+91-9876543210");
        return "contact";
    }

    @GetMapping("/greet")
    public String greetUser(@RequestParam(name = "name", required = false, defaultValue = "मित्र") String name, Model model) {
        String greeting = greetingService.generateGreeting(name);
        model.addAttribute("pageTitle", "अभिवादन");
        model.addAttribute("name", name);
        model.addAttribute("greeting", greeting);
        return "greet";
    }
}
