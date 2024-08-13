package com.springbootBasic.CRUD.service;

import com.springbootBasic.CRUD.model.Student;
import com.springbootBasic.CRUD.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo srepo;
    public void addStudent(Student s) {
        srepo.save(s);
    }

    public List<Student> findAll(){
        return srepo.findALL();
    }
}
