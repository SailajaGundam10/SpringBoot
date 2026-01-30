package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Products {
    @GetMapping("/")
    public String home() {
        return "Spring Boot is running!";
    }
}
