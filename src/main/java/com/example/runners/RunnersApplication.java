package com.example.runners;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class RunnersApplication {
	private static final Logger log=(Logger) LoggerFactory.getLogger(RunnersApplication.class);

	public static void main(String[] args) {
		/* ConfigurableApplicationContext con= SpringApplication.run(RunnersApplication.class, args);
		//i am trying test my g
		var Welcome=new WelcomeMessage();
		System.out.println(Welcome.getGetWelocome());
		WelcomeMessage welcomeMessage=(WelcomeMessage)con.getBean("welcomeMessage");
		System.out.println(welcomeMessage.getGetWelocome()); */ 
		SpringApplication.run(RunnersApplication.class, args);
		var Welcome=new WelcomeMessage();
		log.info("Application started succeddfully");
		System.out.println(Welcome.getGetWelocome());
	}

}
