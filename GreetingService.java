package com.example.mywebsite.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    
    public String generateGreeting(String name) {
        return "नमस्ते " + name + "! आपका दिन शुभ हो";
    }
}
