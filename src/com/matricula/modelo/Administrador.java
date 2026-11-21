package com.matricula.modelo;

public class Administrador extends Persona {
    private String codigoAdmin;
    private String cargo;

    public Administrador(String dni, String nombres, String apellidos, String correo, String password, String codigoAdmin, String cargo) {
        super(dni, nombres, apellidos, correo, password);
        this.codigoAdmin = codigoAdmin;
        this.cargo = cargo;
    }

    public String getCodigoAdmin() {
        return codigoAdmin;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void mostrarPanel() {
        System.out.println("=== PANEL ADMINISTRATIVO ===");
        System.out.println("Administrador: " + nombres + " " + apellidos);
        System.out.println("Cargo: " + cargo);
    }
}