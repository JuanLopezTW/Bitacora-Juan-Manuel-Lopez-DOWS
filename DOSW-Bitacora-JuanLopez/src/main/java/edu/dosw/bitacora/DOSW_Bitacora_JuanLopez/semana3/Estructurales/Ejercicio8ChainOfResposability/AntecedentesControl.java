package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Estructurales.Ejercicio8ChainOfResposability;

public class AntecedentesControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isAntecedentesLimpios()) {
            System.out.println("Control de Antecedentes: RECHAZADO - Antecedentes criminales encontrados.");
        } else {
            System.out.println("Control de Antecedentes: APROBADO");
            pasarAlSiguiente(request);
        }
    }
}