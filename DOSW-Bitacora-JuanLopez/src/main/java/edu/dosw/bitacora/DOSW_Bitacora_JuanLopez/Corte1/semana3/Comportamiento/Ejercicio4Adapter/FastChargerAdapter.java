package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Comportamiento.Ejercicio4Adapter;

public class FastChargerAdapter implements FuelService {
    private FastElectricCharger charger;

    public FastChargerAdapter(FastElectricCharger charger) {
        this.charger = charger;
    }

    @Override
    public void supply(int liters) {
        double kWh = convertLitersToKWh(liters);
        charger.fastCharge(kWh);
    }

    private double convertLitersToKWh(int liters) {
        return liters * 8.0;
    }
}