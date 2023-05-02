package jp.co.sss.training.lesson01_09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Request0109Controller {
    @RequestMapping("/lesson01_09/input")
    public String input(){
        return "/lesson0109/input";
    }

    @RequestMapping("/lesson01_09/result")
    public String result(){
        return "/lesson0109/result";
    }
    
    @PostMapping("/lesson01_09/input")
    public String getStr(String webStr, Model model){
        model.addAttribute("str", webStr);
        return "/lesson0109/result";
    }
}
