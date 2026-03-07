package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana3.Creacionales.Ejercicio1Factory;

public class PaypalProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new PaypalPayment();
    }
}