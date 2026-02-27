package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Comportamiento.Ejercicio7Decorator;

public class BlindajeDecorator extends BarcoBaseDecorador {

    public BlindajeDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Blindaje";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa() + 20;
    }
}