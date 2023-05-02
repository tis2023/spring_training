package jp.co.sss.training.lesson01_03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Input0103Controller {
    @RequestMapping("/lesson01_03/before")
    public String before(){
        return "/lesson0103/before";
    }

    @RequestMapping("/lesson01_03/after")
    public String after(){
        return "/lesson0103/after";
    }

    @RequestMapping("/after_r")
    public String after_r(){
        return "redirect:/lesson01_03/after";
    }
}
