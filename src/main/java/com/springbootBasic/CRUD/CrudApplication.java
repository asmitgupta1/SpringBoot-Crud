package com.springbootBasic.CRUD;

import com.springbootBasic.CRUD.config.AppConfig;
import com.springbootBasic.CRUD.model.Student;
import com.springbootBasic.CRUD.model.Teacher;
import com.springbootBasic.CRUD.repo.StudentRepo;
import com.springbootBasic.CRUD.repo.TeacherRepo;
import com.springbootBasic.CRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {


		///   code to understand  Annotation ///
//		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
//		Alien obj = context.getBean(Alien.class);
//		obj.compile();

		// code to implement MVC

//		ApplicationContext context = SpringApplication.run(CrudApplication.class, args);
//		StudentService studentService = context.getBean(StudentService.class);
//		Student s = context.getBean(Student.class);
//		s.setSid(32);
//		s.setMarks(20);
//		s.setSname("test1");
//		studentService.addStudent(s);
//
//		List<Student> students = studentService.findAll();
//		System.out.println(students.toString());


		// code to learn jpa
		ApplicationContext context = SpringApplication.run(CrudApplication.class, args);


		TeacherRepo trepo =  context.getBean(TeacherRepo.class);
		Teacher t1 = context.getBean(Teacher.class);
		Teacher t2 = context.getBean(Teacher.class);
		Teacher t3 = context.getBean(Teacher.class);

//		t1.setName("test1");
//		t1.setMarks(1);
//		t1.setRollNo(1);
//
//		t2.setName("test2");
//		t2.setMarks(2);
//		t2.setRollNo(2);
//
//		t3.setName("test3");
//		t3.setMarks(3);
//		t3.setRollNo(3);
//
//		trepo.save(t2);
//		trepo.save(t3);
//
//		System.out.println(trepo.findAll());
//		System.out.println(trepo.findById(1));
//		System.out.println(trepo.findByName("test1"));

//		t3.setName("test3");
//		t3.setMarks(4);
//		t3.setRollNo(3);
////
//		trepo.save (t3);
//		trepo.deleteById(3);
	}

}
