package org.afernandez.example.bean;

import org.afernandez.example.bean.component.ComponentBean;
import org.afernandez.example.bean.service.ServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Aplicación principal que demuestra el uso de Beans en Spring Boot.
 */
@SpringBootApplication
public class BeanApplication implements CommandLineRunner {

	@Autowired
	private ServiceBean serviceBean;  // Inyección de dependencia automática

	@Autowired
	private ComponentBean componentBean;  // Inyección de dependencia automática

	@Autowired
	private ApplicationContext context;  // Para obtener Beans manualmente

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
	}

	/**
	 * Ejecuta la aplicación y muestra los mensajes de los Beans inyectados.
	 */
	@Override
	public void run(String... args) {
		// Mostrar mensajes de Beans inyectados
		System.out.println(serviceBean.getMessage());
		System.out.println(componentBean.getMessage());

		// Obtener un Bean definido manualmente en ConfigBean
		String exampleBean = context.getBean(String.class);
		System.out.println("Bean manual: " + exampleBean);
	}
}
