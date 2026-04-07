package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio1;

public class PushStrategy implements NotificationStrategy{
    private String reciver;
    private String message;

    public PushStrategy(String reciver, String message) {
        this.reciver = reciver;
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Enviando PUSH a " + reciver + ": " + message);
    }
}
