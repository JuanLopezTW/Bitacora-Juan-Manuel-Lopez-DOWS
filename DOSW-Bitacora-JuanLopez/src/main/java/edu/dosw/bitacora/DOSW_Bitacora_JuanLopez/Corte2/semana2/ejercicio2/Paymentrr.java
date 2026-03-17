package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public interface Paymentrr {
    void setNext(Paymentrr next);
    boolean handle(PaymentRequest request);
}
