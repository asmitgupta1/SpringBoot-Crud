package com.springbootBasic.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
    private int age;


    private Computer com;
    Alien(){
       System.out.println("Alien constructor called");
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        com.compile();
    }
    public void compile(){
        System.out.println(age);
        System.out.println(com);
        System.out.println("inside alien class");
    }
}
