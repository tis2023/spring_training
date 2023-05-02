package jp.co.sss.training.lesson01_04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello0104Controller {
    @RequestMapping("/lesson01_04/world")
    public String world(){
        return "/lesson0104/world";
    }
    
    @RequestMapping("/lesson01_04/hello")
    public String hello(){
        return "redirect:/lesson01_04/world";
    }
}
