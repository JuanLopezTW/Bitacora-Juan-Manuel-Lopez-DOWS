package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Creacionales.Ejercicio1Factory;

public class PaypalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pago con PayPal por $ " + amount);
    }
}
