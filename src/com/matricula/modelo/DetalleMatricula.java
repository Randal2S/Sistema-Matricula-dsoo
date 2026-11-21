package com.matricula.modelo;

public class DetalleMatricula {
    private Seccion seccion;
    private double notaParcial;
    private double notaFinal;
    private EstadoMatricula estado;

    public DetalleMatricula(Seccion seccion) {
        this.seccion = seccion;
        this.notaParcial = 0.0;
        this.notaFinal = 0.0;
        this.estado = EstadoMatricula.MATRICULADO;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public EstadoMatricula getEstado() {
        return estado;
    }

    public void setEstado(EstadoMatricula estado) {
        this.estado = estado;
    }
}