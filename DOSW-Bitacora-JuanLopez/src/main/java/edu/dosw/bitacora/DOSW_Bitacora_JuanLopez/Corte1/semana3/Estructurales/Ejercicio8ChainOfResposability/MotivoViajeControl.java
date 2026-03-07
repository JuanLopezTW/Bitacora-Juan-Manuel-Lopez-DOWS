package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Estructurales.Ejercicio8ChainOfResposability;

public class MotivoViajeControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isMotivoValido()) {
            System.out.println("Control de Motivo de Viaje: RECHAZADO - Motivo del viaje no válido.");
        } else {
            System.out.println("Control de Motivo de Viaje: APROBADO");
            pasarAlSiguiente(request);
        }
    }
}