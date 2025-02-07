package com.example.service;

import org.springframework.stereotype.Service;

@Service  // Marca esta clase como un servicio administrado por Spring
public class MyService {

    public String getServiceMessage() {
        return "Mensaje desde MyService";
    }
}
