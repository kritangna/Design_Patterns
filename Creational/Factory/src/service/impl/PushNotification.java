package service.impl;

import service.NotificationService;

public class PushNotification implements NotificationService {
    public PushNotification() {
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push notification: " + message);
    }
}
