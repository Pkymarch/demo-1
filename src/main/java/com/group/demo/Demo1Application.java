package com.group.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.group.demo.model.Alian;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Demo1Application.class, args);
		   Alian a=context.getBean(Alian.class);
		   a.display();
	}
}
