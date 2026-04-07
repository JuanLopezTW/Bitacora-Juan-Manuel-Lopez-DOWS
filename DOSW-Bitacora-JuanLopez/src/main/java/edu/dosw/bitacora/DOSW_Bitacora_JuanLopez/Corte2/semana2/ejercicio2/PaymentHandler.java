package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio2;

public abstract class PaymentHandler implements Paymentrr{
    private Paymentrr next;

    @Override
    public void setNext(Paymentrr next){
        this.next = next;
    }

    public Paymentrr getNext() {
        return next;
    }

    @Override
    public abstract boolean handle(PaymentRequest request);
}
