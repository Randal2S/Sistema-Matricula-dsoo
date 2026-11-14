package com.matricula.modelo;

public class Estudiante extends Persona {
    private String codigoEstudiante;
    private int creditosAcumulados;
    private double promedioPonderado;

    public Estudiante(String dni, String nombres, String apellidos, String correo, String password, String codigoEstudiante) {
        super(dni, nombres, apellidos, correo, password);
        this.codigoEstudiante = codigoEstudiante;
        this.creditosAcumulados = 0;
        this.promedioPonderado = 0.0;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public int getCreditosAcumulados() {
        return creditosAcumulados;
    }

    public void setCreditosAcumulados(int creditosAcumulados) {
        this.creditosAcumulados = creditosAcumulados;
    }

    public double getPromedioPonderado() {
        return promedioPonderado;
    }

    public void setPromedioPonderado(double promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }

    @Override
    public void mostrarPanel() {
        System.out.println("Bienvenido, " + nombres + " " + apellidos);
        System.out.println("Código: " + codigoEstudiante);
        System.out.println("Créditos Acumulados: " + creditosAcumulados);
    }
}