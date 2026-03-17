package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Comportamiento.Ejercicio4Adapter;

public class GasPump implements FuelService{
    @Override
    public void supply(int liters) {
        System.out.println("Suministrando " + liters + " litros de gasolina");
    }
}
