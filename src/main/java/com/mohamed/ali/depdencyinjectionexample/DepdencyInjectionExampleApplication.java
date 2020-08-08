package com.mohamed.ali.depdencyinjectionexample;

import controller.ConstructorInjectedController;
import controller.MyController;
import controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controller" , "services"})
public class DepdencyInjectionExampleApplication {

	public static void main(String[] args) {
		// returns application context
		ApplicationContext ctx = SpringApplication.run(DepdencyInjectionExampleApplication.class, args);

		// gets instances from the context
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		// PropertyInjected
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("------> Property");
		System.out.println(propertyInjectedController.getGreeting());

		// Constructor Based
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("------> Constructor");
		System.out.println(constructorInjectedController.getGreetings());

	}




}
