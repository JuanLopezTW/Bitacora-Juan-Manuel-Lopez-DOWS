package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana2.Patrones.Ejericicio1;

public class SMSNotification implements Norification{
    public void send(String message) {
        System.out.println("SMS enviado: " + message);
    }
}
