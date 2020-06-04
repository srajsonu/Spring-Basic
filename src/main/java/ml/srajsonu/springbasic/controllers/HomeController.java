package ml.srajsonu.springbasic.controllers;

import ml.srajsonu.springbasic.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
@Component
public class HomeController {


    @RequestMapping("/home2")
    //@ResponseBody
    public String home(Model model) {

        Object[] urls = {"abc.com", "efg.com"};
        model.addAttribute("name", MyUtils.getMessage("text", urls));
        return "home";
    }

    @RequestMapping("/home3")
    public ModelAndView home_2() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("name","KLAUS");
        return modelAndView;

    }

}
