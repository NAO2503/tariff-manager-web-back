package com.tariff.manager.back;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@OpenAPIDefinition
@ComponentScan(basePackages = {
        "com.tariff.manager.back.application",
        "com.tariff.manager.back.boot",
        "com.tariff.manager.back.driven.repositories",
        "com.tariff.manager.back.driving.controllers"
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}