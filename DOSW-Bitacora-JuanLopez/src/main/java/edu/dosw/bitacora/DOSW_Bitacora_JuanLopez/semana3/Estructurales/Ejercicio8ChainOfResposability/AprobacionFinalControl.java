package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Estructurales.Ejercicio8ChainOfResposability;

public class AprobacionFinalControl extends ControlMigratorioHandler {

    @Override
    public void procesar(IngresoRequest request) {
        request.setAprobado(true);
        System.out.println("Aprobación Final: INGRESO PERMITIDO a Estados Unidos.");
    }
}