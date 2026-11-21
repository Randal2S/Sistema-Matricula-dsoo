package com.matricula.modelo;

public class Profesor extends Persona {
    private String codigoProfesor;
    private String departamento;

    public Profesor(String dni, String nombres, String apellidos, String correo, String password, String codigoProfesor, String departamento) {
        super(dni, nombres, apellidos, correo, password);
        this.codigoProfesor = codigoProfesor;
        this.departamento = departamento;
    }

    public String getCodigoProfesor() {
        return codigoProfesor;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void mostrarPanel() {
        System.out.println("=== PANEL DE PROFESOR ===");
        System.out.println("Docente: " + nombres + " " + apellidos);
        System.out.println("Codigo: " + codigoProfesor + " | Departamento: " + departamento);
    }
}
