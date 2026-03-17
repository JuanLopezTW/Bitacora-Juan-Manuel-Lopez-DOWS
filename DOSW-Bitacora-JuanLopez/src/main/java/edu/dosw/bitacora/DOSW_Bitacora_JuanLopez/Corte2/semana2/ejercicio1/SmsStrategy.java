package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio1;

public class SmsStrategy implements NotificationStrategy{
    private String reciver;
    private String message;

    public SmsStrategy(String reciver, String message) {
        this.reciver = reciver;
        this.message = message;
    }
    @Override
    public void send() {
        System.out.println("Enviando mensaje al " + reciver + ": " + message);
    }

}
