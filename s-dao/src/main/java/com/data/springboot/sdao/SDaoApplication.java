package com.data.springboot.sdao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SDaoApplication.class, args);
    }

}
