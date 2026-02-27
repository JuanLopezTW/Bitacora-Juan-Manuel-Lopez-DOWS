package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Comportamiento.Ejercicio5Bridge;

public class Cuadrado extends Forma {

    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Cuadrado de color " + color.aplicarColor());
    }
}