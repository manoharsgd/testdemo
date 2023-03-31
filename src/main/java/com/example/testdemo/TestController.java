package com.example.testdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/message")
    public String message()
    {
        return "Wel Come to Spring Boot  Azur !!! ";
    }
}
