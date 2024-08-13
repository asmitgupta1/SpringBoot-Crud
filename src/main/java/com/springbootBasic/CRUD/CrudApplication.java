package com.springbootBasic.CRUD;

import com.springbootBasic.CRUD.config.AppConfig;
import com.springbootBasic.CRUD.model.Student;
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

		ApplicationContext context = SpringApplication.run(CrudApplication.class, args);
		StudentService studentService = context.getBean(StudentService.class);
		Student s = context.getBean(Student.class);
		s.setSid(32);
		s.setMarks(20);
		s.setSname("test1");
		studentService.addStudent(s);

		List<Student> students = studentService.findAll();
		System.out.println(students.toString());

	}

}
