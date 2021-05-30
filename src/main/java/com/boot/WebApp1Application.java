package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.boot")
public class WebApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebApp1Application.class, args);
	}

}
