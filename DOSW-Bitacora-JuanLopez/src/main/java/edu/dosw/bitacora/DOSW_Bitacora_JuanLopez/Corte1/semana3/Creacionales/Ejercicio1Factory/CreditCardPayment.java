package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Creacionales.Ejercicio1Factory;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Pago con Tarjeta de Crédito por $ " + amount);
    }
}
