package com.example.springboot;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot.Model.Book;
import com.example.springboot.Model.User;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}

}
