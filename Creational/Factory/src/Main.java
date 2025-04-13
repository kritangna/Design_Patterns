import service.NotificationFactory;
import service.NotificationService;

public class Main {
    public static void main(String[] args) {

        NotificationService email = NotificationFactory.sendNotification("EMAIL");
        NotificationService sms = NotificationFactory.sendNotification("SMS");
        NotificationService push = NotificationFactory.sendNotification("PUSH");

        email.sendNotification("Your OTP is 12***");
        sms.sendNotification("Your pack is expiring today midnight");
        push.sendNotification("Your food is on the way");
    }
}