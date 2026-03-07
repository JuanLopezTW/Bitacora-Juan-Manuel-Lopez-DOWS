package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Comportamiento.Ejercicio7Decorator;

public class AntitorpedosDecorator extends BarcoBaseDecorador {

    public AntitorpedosDecorator(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + " + Antitorpedos";
    }

    @Override
    public int poderAtaque() {
        return barco.poderAtaque();
    }

    @Override
    public int defensa() {
        return barco.defensa() + 15;
    }
}