package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana2.Patrones.Ejericicio1;

public class EmailNotification implements Norification{
    public void send(String message) {
        System.out.println("Email enviado: " + message);
    }
}
