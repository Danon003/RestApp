package ru.danon.spring.RestApp.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RESTController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World";
    }
}
