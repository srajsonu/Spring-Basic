package ml.srajsonu.springbasic.controllers;

import ml.srajsonu.springbasic.mail.MailSender;
import ml.srajsonu.springbasic.mail.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@RestController
@Component
public class MailController {

    private MailSender mailSender;

    public MailController(MailSender SMTP) {
        this.mailSender = SMTP;
    }

    @RequestMapping("/mail")
    public String mail() throws MessagingException {

        mailSender.send( "srajsonu02@gmail.com",  "subject of mail", "body of mail");
        System.out.println(" Mail sent...");
        return "Mail sent....";
    }
}
