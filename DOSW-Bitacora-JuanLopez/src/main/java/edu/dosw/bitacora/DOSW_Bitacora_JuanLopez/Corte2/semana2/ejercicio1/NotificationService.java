package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio1;

public class NotificationService {
    private static NotificationService instance;
    private NotificationStrategy strategy;

    private NotificationService() {
    }

    public void sendNotification() {
        strategy.send();
    }

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }
}
