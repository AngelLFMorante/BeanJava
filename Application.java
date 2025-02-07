package com.example;

import com.example.service.MyService;
import com.example.component.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication  // Habilita la configuración automática de Spring Boot
public class MainApplication implements CommandLineRunner {

    @Autowired
    private MyService myService;  // Inyección de dependencia

    @Autowired
    private MyComponent myComponent;  // Inyección de dependencia

    @Autowired
    private ApplicationContext context;  // Para acceder a los Beans

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Usando los Beans inyectados
        System.out.println(myService.getServiceMessage());
        System.out.println(myComponent.getComponentMessage());

        // Obtener un Bean manualmente
        String exampleBean = context.getBean(String.class);
        System.out.println("Bean manual: " + exampleBean);
    }
}
