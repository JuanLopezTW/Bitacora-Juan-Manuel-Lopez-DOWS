package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class BalanceValidator extends PaymentHandler{
    @Override
    public boolean handle(PaymentRequest request) {
        if (request.getBalance() < request.getAmount()) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        System.out.println("Saldo validado");
        if (getNext() != null) {
            return getNext().handle(request);
        }
        return true;
    }
}
