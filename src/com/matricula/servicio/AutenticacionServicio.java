package com.matricula.servicio;

import com.matricula.modelo.Persona;
import java.util.List;

public class AutenticacionServicio {
    public Persona iniciarSesion(List<Persona> usuarios, String correo, String password) {
        for (Persona persona : usuarios) {
            if (persona.getCorreo().equalsIgnoreCase(correo) && persona.getPassword().equals(password)) {
                return persona;
            }
        }
        return null;
    }
}