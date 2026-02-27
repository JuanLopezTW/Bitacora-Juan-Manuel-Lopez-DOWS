package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Comportamiento.Ejercicio4Adapter;

public class GasPump implements FuelService{
    @Override
    public void supply(int liters) {
        System.out.println("Suministrando " + liters + " litros de gasolina");
    }
}
