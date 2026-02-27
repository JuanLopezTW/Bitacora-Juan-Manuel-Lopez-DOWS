package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana2.Solid;

public class Divide implements  Operation{
    public double execute(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir entre cero");
        return a / b;
    }
}
