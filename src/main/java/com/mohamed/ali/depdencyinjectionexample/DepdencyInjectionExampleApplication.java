package com.mohamed.ali.depdencyinjectionexample;

import controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controller"})
public class DepdencyInjectionExampleApplication {

	public static void main(String[] args) {
		// returns application context
		ApplicationContext ctx = SpringApplication.run(DepdencyInjectionExampleApplication.class, args);

		// gets instances from the context
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

	}




}
