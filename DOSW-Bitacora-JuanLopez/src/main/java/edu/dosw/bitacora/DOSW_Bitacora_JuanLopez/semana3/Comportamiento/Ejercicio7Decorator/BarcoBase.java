package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Comportamiento.Ejercicio7Decorator;

public class BarcoBase implements Barco {

    @Override
    public String getDescripcion() {
        return "Barco Base";
    }

    @Override
    public int poderAtaque() {
        return 10;
    }

    @Override
    public int defensa() {
        return 5;
    }
}