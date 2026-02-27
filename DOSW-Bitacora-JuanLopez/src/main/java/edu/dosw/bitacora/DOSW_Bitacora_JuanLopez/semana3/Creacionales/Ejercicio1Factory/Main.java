package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana3.Creacionales.Ejercicio1Factory;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor;

        processor = new CreditCardProcessor();
        processor.processPayment(100);

        processor = new PaypalProcessor();
        processor.processPayment(250);

        processor = new BankTransferProcessor();
        processor.processPayment(500);
    }
}