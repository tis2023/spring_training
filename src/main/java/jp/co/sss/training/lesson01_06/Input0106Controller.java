package jp.co.sss.training.lesson01_06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Input0106Controller {
    @RequestMapping("/lesson01_06/postForm")
    public String postForm(){
        return "/lesson0106/postForm";
    }

    @PostMapping("/lesson01_06/getStr")
    public String getStr(String str){
        System.out.println(str);
        return "/lesson0106/postForm";
    }
}
