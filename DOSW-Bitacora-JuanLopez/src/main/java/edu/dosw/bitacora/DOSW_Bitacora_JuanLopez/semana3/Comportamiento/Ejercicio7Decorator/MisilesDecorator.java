package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Comportamiento.Ejercicio7Decorator;

public class MisilesDecorator extends BarcoBaseDecorador {
    public MisilesDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Misiles";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 30;
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}