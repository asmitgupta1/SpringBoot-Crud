package com.springbootBasic.CRUD;

import com.springbootBasic.CRUD.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {

		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		Alien obj = context.getBean(Alien.class);
		obj.compile();

//		SpringApplication.run(CrudApplication.class, args);

	}

}
