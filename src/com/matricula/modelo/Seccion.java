package com.matricula.modelo;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
    private String codigoSeccion;
    private Curso curso;
    private Profesor profesor;
    private int vacantesTotales;
    private int vacantesDisponibles;
    private List<Horario> horarios;

    public Seccion(String codigoSeccion, Curso curso, Profesor profesor, int vacantesTotales) {
        this.codigoSeccion = codigoSeccion;
        this.curso = curso;
        this.profesor = profesor;
        this.vacantesTotales = vacantesTotales;
        this.vacantesDisponibles = vacantesTotales;
        this.horarios = new ArrayList<>();
    }

    public void agregarHorario(Horario horario) {
        this.horarios.add(horario);
    }

    public boolean reducirVacante() {
        if (vacantesDisponibles > 0) {
            vacantesDisponibles--;
            return true;
        }
        return false;
    }

    public String getCodigoSeccion() {
        return codigoSeccion;
    }

    public Curso getCurso() {
        return curso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public int getVacantesDisponibles() {
        return vacantesDisponibles;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }
}