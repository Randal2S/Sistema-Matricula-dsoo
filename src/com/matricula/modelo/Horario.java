package com.matricula.modelo;

public class Horario {
    private int diaIndice;
    private int horaInicio;
    private int horaFin;

    public Horario(int diaIndice, int horaInicio, int horaFin) {
        this.diaIndice = diaIndice;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getDiaIndice() {
        return diaIndice;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }
}