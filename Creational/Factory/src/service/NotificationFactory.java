package service;

import service.impl.EmailNotification;
import service.impl.PushNotification;
import service.impl.SMSNotification;

public class NotificationFactory {

    public static NotificationService sendNotification(String type) {
        switch (type) {
            case "SMS":
                return new SMSNotification();
            case "PUSH":
                return new PushNotification();
            case "EMAIL":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Invalid Notification Type");
        }
    }
}
