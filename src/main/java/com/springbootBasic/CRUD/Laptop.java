package com.springbootBasic.CRUD;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    Laptop(){
//        System.out.println("inside Laptop Constructor");
    }

    @Override
    public void compile(){
        System.out.println("inside Laptop class");
    }
}
