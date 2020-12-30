package com.underworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @GetMapping("hello.do")
    public String Test(){
        return "HelloWorld";
    }
}
