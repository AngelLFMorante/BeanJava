package org.afernandez.example.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase de configuración de Spring donde se definen Beans manualmente.
 */
@Configuration  // Indica que esta clase contiene definiciones de Beans
public class ConfigBean {

    private static final String BEAN_MESSAGE = "Este es un Bean definido con @Bean";

    /**
     * Define un Bean manualmente.
     *
     * @return Un String que representa el Bean.
     */
    @Bean
    public String exampleBean() {
        return BEAN_MESSAGE;
    }
}
