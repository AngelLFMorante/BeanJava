package org.afernandez.example.bean.component;

import org.springframework.stereotype.Component;

/**
 * Un componente de Spring detectado automáticamente.
 * Puede ser inyectado en otras partes de la aplicación.
 */
@Component  // Indica que esta clase es un Bean gestionado por Spring
public class ComponentBean {

    private static final String MESSAGE = "Mensaje desde ComponentBean";

    /**
     * Obtiene un mensaje de este componente.
     *
     * @return Mensaje del componente.
     */
    public String getMessage() {
        return MESSAGE;
    }
}
