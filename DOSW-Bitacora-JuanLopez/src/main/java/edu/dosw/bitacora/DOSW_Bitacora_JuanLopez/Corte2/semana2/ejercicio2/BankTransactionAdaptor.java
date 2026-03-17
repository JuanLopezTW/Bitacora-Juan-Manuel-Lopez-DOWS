package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class BankTransactionAdaptor implements PaymentProssesor {
    private BankTransactionApi bankTransactionApi;

    public BankTransactionAdaptor(BankTransactionApi bankTransactionApi) {
        this.bankTransactionApi = bankTransactionApi;
    }
    @Override
    public void processPayment(PaymentRequest request) {
        bankTransactionApi.transferFounds(request.getAmount());
    }
}
