package ml.srajsonu.springbasic.controllers;

import ml.srajsonu.springbasic.commands.UserCommand;
import ml.srajsonu.springbasic.mail.MockMailSender;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/signup")
public class SignupController {


    private static Log log = LogFactory.getLog(SignupController.class);

    @GetMapping
    public String Signup() {

        //model.addAttribute(new UserCommand());
        return "signup";
    }

    @PostMapping
    public String doSignup(@Validated UserCommand user, BindingResult result) {

        if (result.hasErrors()) {
            return "signup";
        }

        log.info("email: "+user.getEmail()+"; Name: "+ user.getName() + "; password: "+ user.getPassword());
        return "redirect:/";
    }

}
