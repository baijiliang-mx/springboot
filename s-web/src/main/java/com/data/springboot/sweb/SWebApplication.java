package com.data.springboot.sweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SWebApplication.class, args);
    }

}
