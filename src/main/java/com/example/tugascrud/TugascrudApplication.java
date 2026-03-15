package com.example.tugascrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.tugascrud")
public class TugascrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TugascrudApplication.class, args);
    }

}