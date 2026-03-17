package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class CreditCardAdaptor implements PaymentProssesor {
    private CreditCardApi creditCardApi;

    public CreditCardAdaptor(CreditCardApi creditCardApi) {
        this.creditCardApi = creditCardApi;
    }

    @Override
    public void processPayment(PaymentRequest request) {
        creditCardApi.processeCard(request.getAmount());

    }
}
