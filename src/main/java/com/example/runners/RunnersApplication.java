package com.example.runners;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.runners.run.Location;
import com.example.runners.run.Run;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class RunnersApplication {
    private static final Logger log = (Logger) LoggerFactory.getLogger(RunnersApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RunnersApplication.class, args);
        var welcome = new WelcomeMessage();
        log.info("Application started successfully");
        System.out.println(welcome.getGetWelocome());
    }

    @Bean
    CommandLineRunner runners() {
        return args -> {
            Run r = new Run(1, "First run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.Outdoor);
            log.info("Run: " + r);
        };
    }
}
