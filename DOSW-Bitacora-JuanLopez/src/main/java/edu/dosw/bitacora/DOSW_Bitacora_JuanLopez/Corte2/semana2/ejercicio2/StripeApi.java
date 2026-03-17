package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class StripeApi {
    private String keyApi;

    public StripeApi(String keyApi) {
        this.keyApi = keyApi;
    }


    public void chargeSald(double amount){
        System.out.println("Stripe procesando pago de $" + amount + " con apiKey: " + keyApi);
    }
}
