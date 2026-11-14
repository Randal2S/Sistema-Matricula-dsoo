package com.matricula;

import com.matricula.modelo.Estudiante;
import com.matricula.repositorio.BaseDatosMemoria;
import com.matricula.repositorio.DatosIniciales;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO SISTEMA DE MATRÍCULA DSOO (CONSOLA) ===");
        
        // 1. Cargar datos iniciales
        DatosIniciales.cargar();

        // 2. Probar búsqueda en el HashMap y Polimorfismo
        Estudiante alumnoEncontrado = BaseDatosMemoria.buscarEstudiante("20240001");
        
        if (alumnoEncontrado != null) {
            System.out.println("\n[Test] Estudiante encontrado en la base de datos temporal:");
            alumnoEncontrado.mostrarPanel(); // Polimorfismo en acción
        }
    }
}

