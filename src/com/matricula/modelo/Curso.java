package com.matricula.modelo;
import java.util.*;

public class Curso {
    private String codigoCurso;
    private String nombre;
    private int creditos;
    private int ciclo;
    private List<Curso> prerrequisitos; // Relación de agregación/composición interna

    public Curso(String codigoCurso, String nombre, int creditos, int ciclo) {
        this.codigoCurso = codigoCurso;
        this.nombre = nombre;
        this.creditos = creditos;
        this.ciclo = ciclo;
        this.prerrequisitos = new ArrayList<>();
    }

    public void agregarPrerrequisito(Curso curso) {
        this.prerrequisitos.add(curso);
    }

    public String getCodigoCurso() { return codigoCurso; }
    public String getNombre() { return nombre; }
    public int getCreditos() { return creditos; }
    public int getCiclo() { return ciclo; }
    public List<Curso> getPrerrequisitos() { return prerrequisitos; }
}