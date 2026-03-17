package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana2.Patrones.Ejericio2;

public class Main {
    public static void main(String[] args) {
        Printer simple = new SimplePrinter();
        Printer adapter = new PrinterAdapter(new DetailedPrinter(), "Juan", "24/02/2026");

        simple.print("Hola mundo");
        System.out.println("---");
        adapter.print("Hola mundo");
    }
}
