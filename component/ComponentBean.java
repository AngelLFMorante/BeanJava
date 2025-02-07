package com.example.component;

import org.springframework.stereotype.Component;

@Component  // Marca esta clase como un componente detectado automáticamente
public class MyComponent {

    public String getComponentMessage() {
        return "Mensaje desde MyComponent";
    }
}
