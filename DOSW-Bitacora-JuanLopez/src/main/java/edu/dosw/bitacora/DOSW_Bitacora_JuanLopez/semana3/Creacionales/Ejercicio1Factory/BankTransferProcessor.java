package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Creacionales.Ejercicio1Factory;

public class BankTransferProcessor extends PaymentProcessor {
    @Override
    protected Payment createPayment() {
        return new BankTransferPayment();
    }
}