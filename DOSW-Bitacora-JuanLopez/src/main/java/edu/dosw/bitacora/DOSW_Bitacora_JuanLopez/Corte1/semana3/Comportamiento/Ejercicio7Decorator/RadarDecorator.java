package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Comportamiento.Ejercicio7Decorator;

public class RadarDecorator extends BarcoBaseDecorador {

    public RadarDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Radar";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque() + 5;
    }

    @Override
    public int defensa() {
        return barco.defensa();
    }
}
