package com.matricula.util;

import com.matricula.modelo.Horario;
import java.util.List;

public class ValidadorHorario {
    private static final int DIAS = 6;
    private static final int HORAS = 24;

    public static boolean hayCruce(List<Horario> horariosActuales, List<Horario> nuevosHorarios) {
        boolean[][] ocupacion = new boolean[DIAS][HORAS];

        for (Horario h : horariosActuales) {
            marcarOcupacion(ocupacion, h);
        }

        for (Horario nuevo : nuevosHorarios) {
            int dia = nuevo.getDiaIndice();
            for (int hora = nuevo.getHoraInicio(); hora < nuevo.getHoraFin(); hora++) {
                if (dia >= 0 && dia < DIAS && hora >= 0 && hora < HORAS) {
                    if (ocupacion[dia][hora]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void marcarOcupacion(boolean[][] ocupacion, Horario horario) {
        int dia = horario.getDiaIndice();
        for (int hora = horario.getHoraInicio(); hora < horario.getHoraFin(); hora++) {
            if (dia >= 0 && dia < DIAS && hora >= 0 && hora < HORAS) {
                ocupacion[dia][hora] = true;
            }
        }
    }
}