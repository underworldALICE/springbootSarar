package com.underworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerTest {

    @GetMapping("/helllo.do")
    public String Test01(){
        return "Hello Alice";

    }
}
