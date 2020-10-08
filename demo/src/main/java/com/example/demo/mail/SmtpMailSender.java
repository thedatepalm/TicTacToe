package com.example.demo.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class SmtpMailSender implements MailSender {

    private static Log Log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        Log.info("Sending SMTP mail to " + to);
        Log.info("with subject " + subject);
        Log.info("and body " + body);
    }
}
