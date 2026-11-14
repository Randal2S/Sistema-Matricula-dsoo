package com.matricula.repositorio;

import com.matricula.modelo.Curso;
import com.matricula.modelo.Estudiante;
import java.util.HashMap;

public class BaseDatosMemoria {
    // Almacenamiento global en memoria usando HashMap 
    private static HashMap<String, Estudiante> estudiantes = new HashMap<>();
    private static HashMap<String, Curso> cursos = new HashMap<>();

    public static void guardarEstudiante(Estudiante estudiante) {
        estudiantes.put(estudiante.getCodigoEstudiante(), estudiante);
    }

    public static Estudiante buscarEstudiante(String codigo) {
        return estudiantes.get(codigo);
    }

    public static void guardarCurso(Curso curso) {
        cursos.put(curso.getCodigoCurso(), curso);
    }

    public static Curso buscarCurso(String codigo) {
        return cursos.get(codigo);
    }
}