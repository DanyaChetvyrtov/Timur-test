package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/danil")
public class DanilController {
    public String sayDanil() {
        String name = "Danil";
        return "Hello " + name;
    }
}
