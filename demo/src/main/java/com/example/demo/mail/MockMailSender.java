package com.example.demo.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MockMailSender implements MailSender {

    private static Log Log = LogFactory.getLog(MockMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        Log.info("Sending MOCK mail to " + to);
        Log.info("with subject " + subject);
        Log.info("and body " + body);
    }
}
