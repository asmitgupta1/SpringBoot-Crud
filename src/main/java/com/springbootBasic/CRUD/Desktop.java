package com.springbootBasic.CRUD;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {

    Desktop(){
//        System.out.println("inside Desktop constructor");
    }
    @Override
    public void compile(){
        System.out.println("inside Desktop class");
    }
}
