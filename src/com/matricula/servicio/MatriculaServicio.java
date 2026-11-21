package com.matricula.servicio;

import com.matricula.modelo.Curso;
import com.matricula.modelo.DetalleMatricula;
import com.matricula.modelo.Estudiante;
import com.matricula.modelo.Horario;
import com.matricula.modelo.Matricula;
import com.matricula.modelo.Seccion;
import com.matricula.util.ValidadorHorario;
import java.util.ArrayList;
import java.util.List;

public class MatriculaServicio {
    private static final int LIMITE_CREDITOS_CICLO = 22;

    public boolean matricularSeccion(Matricula matricula, Seccion seccion, List<Curso> cursosAprobados) {
        if (matricula == null || seccion == null) {
            System.out.println("Error: Datos de matricula o seccion invalidos.");
            return false;
        }

        Estudiante estudiante = matricula.getEstudiante();
        Curso cursoSolicitado = seccion.getCurso();

        if (estudiante == null) {
            System.out.println("Error: No se encontro el estudiante en la matricula.");
            return false;
        }

        if (seccion.getVacantesDisponibles() <= 0) {
            System.out.println("Error: No hay vacantes disponibles en la seccion " + seccion.getCodigoSeccion());
            return false;
        }

        int creditosFuturos = matricula.getTotalCreditosMatriculados() + cursoSolicitado.getCreditos();
        if (creditosFuturos > LIMITE_CREDITOS_CICLO) {
            System.out.println("Error: Se excede el limite de " + LIMITE_CREDITOS_CICLO + " creditos por ciclo.");
            return false;
        }

        for (Curso prerrequisito : cursoSolicitado.getPrerrequisitos()) {
            boolean aprobado = false;
            for (Curso cursoAprobado : cursosAprobados) {
                if (cursoAprobado.getCodigoCurso().equals(prerrequisito.getCodigoCurso())) {
                    aprobado = true;
                    break;
                }
            }
            if (!aprobado) {
                System.out.println("Error: Falta aprobar el prerrequisito " + prerrequisito.getNombre());
                return false;
            }
        }

        List<Horario> horariosActuales = new ArrayList<>();
        for (DetalleMatricula detalle : matricula.getDetalles()) {
            horariosActuales.addAll(detalle.getSeccion().getHorarios());
        }

        if (ValidadorHorario.hayCruce(horariosActuales, seccion.getHorarios())) {
            System.out.println("Error: Existe cruce de horario con otra seccion matriculada.");
            return false;
        }

        seccion.reducirVacante();
        matricula.agregarDetalle(new DetalleMatricula(seccion));
        System.out.println("Matricula exitosa en " + cursoSolicitado.getNombre() + " (" + estudiante.getNombres() + ").");
        return true;
    }
}