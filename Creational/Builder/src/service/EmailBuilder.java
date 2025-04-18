package service;

import entity.Email;

import java.util.List;

public class EmailBuilder {

    private String from;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private String subject;
    private String body;

    public EmailBuilder sendFrom(String from) {
        this.from = from;
        return this;
    }

    public EmailBuilder sendTo(List<String> to) {
        this.to = to;
        return this;
    }

    public EmailBuilder sendCc(List<String> cc) {
        this.cc = cc;
        return this;
    }

    public EmailBuilder sendBcc(List<String> bcc) {
        this.bcc = bcc;
        return this;
    }

    public EmailBuilder subject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder body(String body) {
        this.body = body;
        return this;
    }

    public Email build() {
        return new Email(from, to, cc, bcc, subject, body);

    }
}
