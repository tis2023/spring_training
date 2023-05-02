package jp.co.sss.training.lesson01_10;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.form.LoginForm;

@Controller
public class Login0110Controller {
    @RequestMapping("/lesson01_10/login")
    public String login(){
        return "/lesson0110/login";
    }

    @GetMapping("/lesson01_10/top")
    public String top(){
        return "/lesson0110/top";
    }

    @PostMapping("/lesson01_10/login")
    public String loginSession(LoginForm form, HttpSession session, Model model){
        if(form.getUserId().equals(form.getPassword())){
            session.setAttribute("userId", form.getUserId());
            return "redirect:/lesson01_10/top";
        }else{
            return "/lesson0110/login";
        }
    }

    @GetMapping("/lesson01_10/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/lesson01_10/login";
    }
}
