//Prueba numero 2(avance).
package com.matricula;

import com.matricula.modelo.Curso;
import com.matricula.modelo.Estudiante;
import com.matricula.modelo.Horario;
import com.matricula.modelo.Matricula;
import com.matricula.modelo.Profesor;
import com.matricula.modelo.Seccion;
import com.matricula.repositorio.BaseDatosMemoria;
import com.matricula.repositorio.DatosIniciales;
import com.matricula.servicio.MatriculaServicio;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatosIniciales.cargar();

        Estudiante estudiante = BaseDatosMemoria.buscarEstudiante("20240001");
        Curso algoritmia = BaseDatosMemoria.buscarCurso("IS-102");
        Curso dsoo = BaseDatosMemoria.buscarCurso("IS-201");

        Profesor profesor = new Profesor("44556677", "Carlos", "Corrales", "ccorrales@unsa.edu.pe", "pass123", "DOC-01", "Sistemas");

        Seccion seccionDsoo = new Seccion("SEC-A", dsoo, profesor, 30);
        seccionDsoo.agregarHorario(new Horario(0, 8, 10));
        seccionDsoo.agregarHorario(new Horario(2, 8, 10));

        Matricula matricula = new Matricula("MAT-2026-1", estudiante);
        MatriculaServicio matriculaServicio = new MatriculaServicio();

        List<Curso> aprobadosSinAlgoritmia = new ArrayList<>();
        matriculaServicio.matricularSeccion(matricula, seccionDsoo, aprobadosSinAlgoritmia);

        aprobadosSinAlgoritmia.add(algoritmia);
        matriculaServicio.matricularSeccion(matricula, seccionDsoo, aprobadosSinAlgoritmia);
    }
}