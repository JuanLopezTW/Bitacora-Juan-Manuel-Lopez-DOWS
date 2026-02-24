package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.semana2.Patrones.Ejericicio1;

public class main {
    public static void main(String[] args) {
        Norification n1 = NotificationFactory.create("email");
        Norification n2 = NotificationFactory.create("sms");
        Norification n3 = NotificationFactory.create("push");

        n1.send("Bienvenido!");
        n2.send("Tu código es 1234");
        n3.send("Tienes un nuevo mensaje");
    }
}