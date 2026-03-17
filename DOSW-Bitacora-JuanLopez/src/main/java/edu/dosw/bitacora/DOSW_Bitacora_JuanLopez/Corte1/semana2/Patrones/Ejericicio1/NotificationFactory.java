package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte1.semana2.Patrones.Ejericicio1;

public class NotificationFactory {
    public static Norification create(String type) {
        Norification norification;
        switch(type.toLowerCase()){
            case "email":
                norification = new EmailNotification();
                break;
            case "sms":
                norification = new SMSNotification();
                break;
            case "push":
                norification = new PushNotification();
                break;
            default:
                throw new IllegalArgumentException("Tipo no reconocido: " + type);
        }

        return norification;
    }

}
