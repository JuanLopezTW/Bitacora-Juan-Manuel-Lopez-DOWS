package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class CreditCardApi {
    private String cardNumber;
    private String expirationDate;

    public CreditCardApi(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public void processeCard(double amount){
        System.out.println("Tarjeta de crédito procesando pago de $" + amount + " con tarjeta: " + cardNumber);
    }
}
