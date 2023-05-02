package jp.co.sss.training.lesson01_07;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login0107Controller {
    @RequestMapping("/lesson01_07/login")
    public String login(){
        return "/lesson0107/login";
    }

    @RequestMapping("/lesson01_07/top")
    public String top(){
        return "/lesson0107/top";
    }

    @PostMapping("/lesson01_07/login")
    public String doLogin(String userId, String password){
        System.out.println(userId + password);
        if(userId.equals(password)){
            System.out.println(userId + password);
            return "redirect:/lesson01_07/top";
        } else{
            System.out.println("ちがい");
            return "/lesson0107/login";
        }
    }
}
