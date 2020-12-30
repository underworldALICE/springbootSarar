package com.underworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/user/login.do")
    /*@ResponseBody 如果有这个的话就跳不了视图了*/
    public String Login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session){
        //具体的业务
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("loginUser",username);//把用户名方法session域中
            return "redirect:/main.html";
        }else{
            //告诉用户登录失败
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }
}
