package com.deepak.basicSpringFse;

import com.deepak.basicSpringFse.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BasicSpringFseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringFseApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService service = context.getBean(BookService.class);
		System.out.println(service.returnToMain());
	}

}
