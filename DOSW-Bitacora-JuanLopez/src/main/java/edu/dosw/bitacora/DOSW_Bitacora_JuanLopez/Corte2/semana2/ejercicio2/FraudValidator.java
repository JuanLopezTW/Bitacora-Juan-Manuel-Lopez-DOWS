package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public class FraudValidator extends PaymentHandler{

    @Override
    public boolean handle(PaymentRequest request) {
        if (request.getAmount() > 10000) {
            System.out.println("Transacción sospechosa de fraude");
            return false;
        }
        System.out.println("Transacción no fraudulenta");
        if (getNext() != null) {
            return getNext().handle(request);
        }
        return true;
    }
}
