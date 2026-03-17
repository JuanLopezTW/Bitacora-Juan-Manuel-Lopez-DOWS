package edu.dosw.bitacora.DOSW_Bitacora_JuanLopez.Corte2.semana2.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Field;

class NotificationServiceTest {

    @BeforeEach
    void resetSingleton() throws Exception {
        Field instance = NotificationService.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }

    @Test
    void testGetInstanceReturnsSameInstance() {
        NotificationService s1 = NotificationService.getInstance();
        NotificationService s2 = NotificationService.getInstance();
        assertSame(s1, s2);
    }

    @Test
    void testGetInstanceNotNull() {
        assertNotNull(NotificationService.getInstance());
    }

    @Test
    void testSendEmailStrategy() {
        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new EmailStrategy("juan@email.com", "Hola!"));
        assertDoesNotThrow(service::sendNotification);
    }

    @Test
    void testSendSmsStrategy() {
        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new SmsStrategy("3001234567", "Hola!"));
        assertDoesNotThrow(service::sendNotification);
    }

    @Test
    void testSendPushStrategy() {
        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new PushStrategy("token123", "Hola!"));
        assertDoesNotThrow(service::sendNotification);
    }

    @Test
    void testChangeStrategy() {
        NotificationService service = NotificationService.getInstance();
        service.setStrategy(new EmailStrategy("juan@email.com", "Hola!"));
        service.setStrategy(new SmsStrategy("3001234567", "Hola!"));
        assertDoesNotThrow(service::sendNotification);
    }

    @Test
    void testEmailStrategySend() {
        EmailStrategy email = new EmailStrategy("juan@email.com", "Test");
        assertDoesNotThrow(email::send);
    }

    @Test
    void testSmsStrategySend() {
        SmsStrategy sms = new SmsStrategy("3001234567", "Test");
        assertDoesNotThrow(sms::send);
    }

    @Test
    void testPushStrategySend() {
        PushStrategy push = new PushStrategy("token123", "Test");
        assertDoesNotThrow(push::send);
    }
}
