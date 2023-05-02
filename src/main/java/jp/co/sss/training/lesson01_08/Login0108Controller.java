package jp.co.sss.training.lesson01_08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.form.LoginForm;

@Controller
public class Login0108Controller {
    @RequestMapping("/lesson01_08/login")
    public String login(){
        return "/lesson0108/login";
    }

    @RequestMapping("/lesson01_08/top")
    public String top(){
        return "/lesson0108/top";
    }

    @PostMapping("/lesson01_08/login")
    public String doLogin(LoginForm LF){
        if(LF.getUserId().equals(LF.getPassword())){
            return "redirect:/lesson01_08/top";
        } else {
            return "/lesson0108/login";
        }
    }
}
