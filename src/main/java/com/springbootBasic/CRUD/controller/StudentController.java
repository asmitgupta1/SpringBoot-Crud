package com.springbootBasic.CRUD.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/")
    public String home(){
        System.out.println("test");
        return "index";
    }

    @RequestMapping("/result")
    public  String addResult(){
        System.out.println("result");
        return "result";
    }



}
