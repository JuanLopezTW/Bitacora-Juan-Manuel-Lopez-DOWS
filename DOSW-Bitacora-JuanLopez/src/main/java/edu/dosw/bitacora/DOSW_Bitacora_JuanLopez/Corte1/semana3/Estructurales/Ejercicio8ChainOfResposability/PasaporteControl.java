package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Estructurales.Ejercicio8ChainOfResposability;

public class PasaporteControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isPasaporteValido()) {
            System.out.println("Control de Pasaporte: RECHAZADO - Pasaporte o visa inválidos.");
        } else {
            System.out.println("Control de Pasaporte: APROBADO");
            pasarAlSiguiente(request);
        }
    }
}
