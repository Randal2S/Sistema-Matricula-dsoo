package com.matricula.modelo;

import java.util.ArrayList;
import java.util.List;

public class Matricula {
    private String idMatricula;
    private Estudiante estudiante;
    private List<DetalleMatricula> detalles;

    public Matricula(String idMatricula, Estudiante estudiante) {
        this.idMatricula = idMatricula;
        this.estudiante = estudiante;
        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleMatricula detalle) {
        this.detalles.add(detalle);
    }

    public int getTotalCreditosMatriculados() {
        int total = 0;
        for (DetalleMatricula detalle : detalles) {
            if (detalle.getEstado() == EstadoMatricula.MATRICULADO) {
                total += detalle.getSeccion().getCurso().getCreditos();
            }
        }
        return total;
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public List<DetalleMatricula> getDetalles() {
        return detalles;
    }
}