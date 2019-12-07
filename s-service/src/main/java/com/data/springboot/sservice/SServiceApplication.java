package com.data.springboot.sservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SServiceApplication.class, args);
    }

}
