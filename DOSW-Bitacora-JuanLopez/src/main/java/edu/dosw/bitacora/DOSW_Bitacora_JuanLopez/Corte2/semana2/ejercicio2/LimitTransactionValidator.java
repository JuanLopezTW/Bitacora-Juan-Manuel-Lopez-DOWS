package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class LimitTransactionValidator extends PaymentHandler{
    @Override
    public boolean handle(PaymentRequest request) {
        if (request.getTransactionCount() > 5) {
            System.out.println("limite de transacciones alcanzado");
            return false;
        }
        System.out.println("limite de transacciones no sobrepasado");
        if (getNext() != null) {
            return getNext().handle(request);
        }
        return true;
    }
}
