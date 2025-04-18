import entity.Email;
import service.EmailBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Email email1 =  new EmailBuilder()
                .sendFrom("abc@gmail.com")
                .sendTo(List.of("zzz1@gmail.com", "zzz2@gmail;.com", "zzz3@gmail.com"))
                .subject("Test Email")
                .body("Testing my new Builder Design Pattern")
                .build();

        Email email2 = new EmailBuilder()
                .sendFrom("def@gmail.com")
                .sendTo(List.of("xxx@gmail.com"))
                .sendBcc(List.of("group1", "group2"))
                .sendCc(List.of("hr1", "hr2"))
                .subject("Sick Leave")
                .body("Hi, I am not well and hence taking a day off today")
                .build();

        System.out.println(email1);
        System.out.println(email2);

    }
}