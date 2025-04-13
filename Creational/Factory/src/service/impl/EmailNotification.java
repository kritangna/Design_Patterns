package service.impl;

import service.NotificationService;

public class EmailNotification implements NotificationService {

    public EmailNotification() {}

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}
