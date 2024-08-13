package com.springbootBasic.CRUD.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", marks=" + marks +
                ", sname='" + sname + '\'' +
                '}';
    }

    private int sid;
    private int marks;
    private String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
