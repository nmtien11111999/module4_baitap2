package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
@RequestMapping(value = "/admin")
public class TimeController {


    @GetMapping ("/home")
    public String getTime(@RequestParam(name = "city") String city , ModelMap modelMap) {
        Date date = new Date();
        TimeZone timeZone = TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);
        long localeTime = date.getTime() + (locale.getRawOffset() - timeZone.getRawOffset());
        date.setTime(localeTime);
        modelMap.addAttribute("city", city);
        modelMap.addAttribute("date", date);
        return "home";
    }

}
