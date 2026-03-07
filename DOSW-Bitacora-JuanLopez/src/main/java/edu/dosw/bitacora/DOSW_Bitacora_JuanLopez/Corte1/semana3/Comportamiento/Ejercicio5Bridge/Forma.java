package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Comportamiento.Ejercicio5Bridge;

public abstract class Forma {
    protected Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public abstract void dibujar();
}