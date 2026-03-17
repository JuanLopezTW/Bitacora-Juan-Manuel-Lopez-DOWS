package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Comportamiento.Ejercicio6Composite;

public class Product implements Item {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}