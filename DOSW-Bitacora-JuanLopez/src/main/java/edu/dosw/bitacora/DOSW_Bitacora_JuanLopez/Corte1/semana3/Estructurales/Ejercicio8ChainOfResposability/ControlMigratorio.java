package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Estructurales.Ejercicio8ChainOfResposability;

public interface ControlMigratorio {
    void setSiguiente(ControlMigratorio siguiente);
    void procesar(IngresoRequest request);
}
