package com.sistema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        // Isso liga o servidor web do Spring Boot
        SpringApplication.run(Main.class, args);
        System.out.println("🚀 API rodando na porta 8080!");
    }
}