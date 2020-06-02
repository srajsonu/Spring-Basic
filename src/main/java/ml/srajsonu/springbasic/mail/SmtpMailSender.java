package ml.srajsonu.springbasic.mail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@Component("SMTP")
//@Qualifier("smtpMail")
public class SmtpMailSender implements MailSender {

    private static Log log = LogFactory.getLog(MockMailSender.class);
    private final JavaMailSender javaMailSender;

    public SmtpMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void send(String to, String subject, String body) throws MessagingException {

        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper;

        helper = new MimeMessageHelper(message, true); // true indicates

        helper.setSubject(subject);
        helper.setTo(to);
        helper.setText(body, true); // true indicates html

        javaMailSender.send(message);

    }
}
