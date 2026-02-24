package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana2.Solid;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Suma: "           + calculator.calculate(new Sum(),      10, 5));
        System.out.println("Resta: "          + calculator.calculate(new Subtract(), 10.5, 5.5));
        System.out.println("Multiplicación: " + calculator.calculate(new Multiply(), 10.5, 2.0));
        System.out.println("División: "       + calculator.calculate(new Divide(),   10.5, 2.0));
    }
}