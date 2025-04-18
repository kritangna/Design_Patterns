package entity;

import java.util.List;

public class Email {

    private String from;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private String subject;
    private String body;

    public Email(String from, List<String> to, List<String> cc, List<String> bcc, String subject, String body) {
        this.from = from;
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Email{" +
                "from='" + from + '\'' +
                ", to=" + to +
                ", cc=" + cc +
                ", bcc=" + bcc +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
