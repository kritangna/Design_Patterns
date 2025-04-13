package service.impl;

import service.NotificationService;

public class SMSNotification implements NotificationService {
    public SMSNotification() {
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
    }


}
