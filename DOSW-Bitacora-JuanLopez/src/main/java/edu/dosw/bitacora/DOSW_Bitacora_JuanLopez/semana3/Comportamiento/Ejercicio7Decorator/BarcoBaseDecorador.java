package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Comportamiento.Ejercicio7Decorator;

public abstract class BarcoBaseDecorador implements Barco {
    protected Barco barco;

    public BarcoBaseDecorador(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion();
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}
