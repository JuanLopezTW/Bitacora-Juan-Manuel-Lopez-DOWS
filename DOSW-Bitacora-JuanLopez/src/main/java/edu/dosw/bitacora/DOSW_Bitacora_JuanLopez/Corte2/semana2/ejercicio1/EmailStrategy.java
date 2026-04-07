package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio1;

public class EmailStrategy implements NotificationStrategy{
    private String reciver;
    private String message;

    public EmailStrategy(String reciver, String message) {
        this.reciver = reciver;
        this.message = message;
    }
    @Override
    public void send() {
        System.out.println("Enviando EMAIL a " + reciver + ": " + message);
    }
}
