package com.atreides.jenkinspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsPracticeApplication.class, args);

        System.out.println("Hello from Jenkins practice application!");
        System.out.println("New line to test github connection");
    }
}
