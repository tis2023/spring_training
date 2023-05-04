package jp.co.sss.training.lesson02_03;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.training.bean.UserBean;
import jp.co.sss.training.entity.TrainingUser;
import jp.co.sss.training.repository.TrainingUserRepository;

@Controller
public class User0203Controller {
    @Autowired
    TrainingUserRepository repository;

    @RequestMapping("/lesson02_03/index")
    public String index(Model model) {
        model.addAttribute("userList", repository.findAll());
        return "/lesson0203/index";
    }

    @PostMapping("/lesson02_03/show/{id}")
    public String showIndividualPage(@PathVariable int id, Model model) {
        TrainingUser user = repository.getReferenceById(id);
        UserBean userbean = new UserBean();
        BeanUtils.copyProperties(user, userbean);
        model.addAttribute("userList", userbean);
        return "/lesson0203/show";
    }
}
