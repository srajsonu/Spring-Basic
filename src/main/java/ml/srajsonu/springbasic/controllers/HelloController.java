package ml.srajsonu.springbasic.controllers;

import ml.srajsonu.springbasic.mail.MockMailSender;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Value("${app.name}")
    private String appName;

    private static Log log = LogFactory.getLog(MockMailSender.class);

    @RequestMapping("/hello")
    public String hello() {

        return "Hello world! " + appName;
    }

    @RequestMapping("/hello/{id}")
    public String hello_id(Model model, @PathVariable int id,
                           @RequestParam String name) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "hello-id";
    }
}
