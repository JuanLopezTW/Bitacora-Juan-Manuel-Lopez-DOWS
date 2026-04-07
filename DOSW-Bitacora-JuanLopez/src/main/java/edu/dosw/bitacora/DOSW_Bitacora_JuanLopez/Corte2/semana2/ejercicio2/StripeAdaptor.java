package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class StripeAdaptor implements PaymentProssesor {
    private StripeApi stripeApi;

    public StripeAdaptor(StripeApi stripeApi) {
        this.stripeApi = stripeApi;
    }

    @Override
    public void processPayment(PaymentRequest request) {
        stripeApi.chargeSald(request.getAmount());
    }
}