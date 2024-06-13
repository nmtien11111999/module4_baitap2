package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping(value = "/admin")
public class EmailController {
    private static final String email_regax = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern = Pattern.compile(email_regax);

    public EmailController() {
        pattern = Pattern.compile(email_regax);
    }

    @RequestMapping(value = "/home")
    public String email() {
        return "home";
    }

    @PostMapping(value = "/result")
    public String result(@RequestParam String email , ModelMap modelmap){
        boolean invalid = this.validate(email);
        if(!invalid){
            modelmap.addAttribute("message", "email wrong....idiot!");
            return "home";
        } else {
            modelmap.addAttribute("email", email);
            return "result";
        }
    }


    private boolean validate(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
