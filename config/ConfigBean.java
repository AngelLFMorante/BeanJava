package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // Indica que esta clase contiene definiciones de Beans
public class AppConfig {

    @Bean  // Define un Bean manualmente
    public String exampleBean() {
        return "Este es un Bean definido con @Bean";
    }
}
