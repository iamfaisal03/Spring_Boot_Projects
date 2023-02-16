package com.globallogic.springcrudmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCrudMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudMysqlApplication.class, args);
		System.out.println("This Mysql and Spring Boot Crud Application");
	}

}
