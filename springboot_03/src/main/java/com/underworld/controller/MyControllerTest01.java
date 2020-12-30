package com.underworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

@Controller
public class MyControllerTest01 {

    @RequestMapping("/Alice.do")
    public String HelloWorld(Model model){
        model.addAttribute("user","<h1>Hello  Alice</h1>");
        model.addAttribute("users", Arrays.asList("琴江","狂神"));
        return "index";
    }
}
