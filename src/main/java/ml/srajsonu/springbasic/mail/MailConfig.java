package ml.srajsonu.springbasic.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

//@Component
@Configuration
public class MailConfig {

    @Bean
    public DemoBean demoBean() {
        return new DemoBean();
    }

    @Bean
    //@Profile("dev")
    //@ConditionalOnProperty(name = "spring.mail.host", havingValue = "foo", matchIfMissing = true)
    public MailSender mockMailSenders() {
        return new MockMailSender();
    }

    @Bean
    //@Profile("!dev")
    //@ConditionalOnProperty("spring.mail.host")
    public MailSender smtpMailSenders(JavaMailSender javaMailSender) {
        demoBean();
        return new SmtpMailSender(javaMailSender);
    }
}
