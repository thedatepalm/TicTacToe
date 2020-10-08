package com.example.demo.controller;

import com.example.demo.mail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailSender mailSender;

    public MailController(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @RequestMapping("/mail")
    public String mail() {
        mailSender.send("mail@example.com", "A test mail", "A body of a test mail");

        return "Mail sent";
    }
}
