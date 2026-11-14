package com.matricula.modelo;

public abstract class Persona {
    protected String dni;
    protected String nombres;
    protected String apellidos;
    protected String correo;
    protected String password;

    public Persona(String dni, String nombres, String apellidos, String correo, String password) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
    }

    public String getDni() { return dni; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getCorreo() { return correo; }
    public String getPassword() { return password; }

    public abstract void mostrarPanel();
}

