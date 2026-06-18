package com.deepak.basicSpringFse;

import com.deepak.basicSpringFse.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BasicSpringFseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(BasicSpringFseApplication.class, args);
		BookService service = context.getBean(BookService.class);
		System.out.println(service.returnToMain());
	}

}
