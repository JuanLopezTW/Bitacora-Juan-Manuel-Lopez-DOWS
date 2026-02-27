package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Creacionales.Ejercicio1Factory;

public abstract class PaymentProcessor {
    protected abstract Payment createPayment();

    public void processPayment(double amount) {
        Payment payment = createPayment();
        payment.pay(amount);
    }
}