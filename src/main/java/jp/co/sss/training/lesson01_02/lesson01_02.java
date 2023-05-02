package jp.co.sss.training.lesson01_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class lesson01_02 {
    @RequestMapping("/lesson01_02/before") //URL
    public String before(){
        return "/lesson01/before"; //HTMLパス
    }

    @RequestMapping("/lesson01_02/after")
    public String after(){
        return "/lesson01/after";
    }
}
