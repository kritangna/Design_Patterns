package service;

public class NotificationService {
    
    public NotificationService() {}
    
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber);
        System.out.println("Message: " + message);
    }
}
