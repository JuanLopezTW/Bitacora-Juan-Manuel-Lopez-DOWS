package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class PaypalApi {
    private String clientId;

    public PaypalApi(String clientId) {
        this.clientId = clientId;
    }

    public void makePayment(double amount){
        System.out.println("PayPal procesando pago de $" + amount + " con clientId: " + clientId);

    }
}
