package jp.co.sss.training.lesson01_05;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Input0105Controller {
    @GetMapping("/lesson01_05/getForm")
    public String getForm(){
        return "/lesson0105/getForm";
    }

    @GetMapping("/lesson01_05/getStr")
    public String getStr(String str){
        System.out.println(str);
        return "/lesson0105/getForm";
    }
}
