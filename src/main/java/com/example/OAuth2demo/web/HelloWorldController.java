package com.example.OAuth2demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloWorldController {

    @GetMapping
    String greetings(){
        return "Hello World After Successful Authentication";
    }
}
