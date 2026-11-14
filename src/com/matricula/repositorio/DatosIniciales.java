package com.matricula.repositorio;

import com.matricula.modelo.Curso;
import com.matricula.modelo.Estudiante;

public class DatosIniciales {
    public static void cargar() {
        // Crear cursos de prueba
        Curso dsoo = new Curso("IS-201", "Desarrollo de Software Orientado a Objetos", 4, 3);
        Curso algoritmia = new Curso("IS-102", "Estructuras de Datos y Algoritmos", 4, 2);
        
        // Agregar prerrequisito (Algoritmia es prerrequisito de DSOO)
        dsoo.agregarPrerrequisito(algoritmia);

        BaseDatosMemoria.guardarCurso(algoritmia);
        BaseDatosMemoria.guardarCurso(dsoo);

        // Crear estudiante de prueba (Grupo Boecio)
        Estudiante e1 = new Estudiante("76543210", "Randal", "Mejía", "randal@unsa.edu.pe", "1234", "20240001");
        BaseDatosMemoria.guardarEstudiante(e1);
        
        System.out.println(">> Datos iniciales de prueba cargados correctamente en memoria.");
    }
}