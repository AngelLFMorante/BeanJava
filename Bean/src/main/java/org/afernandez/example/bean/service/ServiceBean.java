package org.afernandez.example.bean.service;

import org.springframework.stereotype.Service;

/**
 * Un servicio de Spring que puede ser inyectado en otras clases.
 */
@Service  // Indica que esta clase es un servicio administrado por Spring
public class ServiceBean {

    private static final String MESSAGE = "Mensaje desde ServiceBean";

    /**
     * Obtiene un mensaje del servicio.
     *
     * @return Mensaje del servicio.
     */
    public String getMessage() {
        return MESSAGE;
    }
}
