package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class PaypalAdaptor implements PaymentProssesor {
    private PaypalApi paypalApi;

    public PaypalAdaptor(PaypalApi paypalApi) {
        this.paypalApi = paypalApi;
    }

    @Override
    public void processPayment(PaymentRequest request) {
        paypalApi.makePayment(request.getAmount());
    }
}
