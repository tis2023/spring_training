package jp.co.sss.training.lesson02_02;

import org.springframework.stereotype.Controller;
import jp.co.sss.training.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Item0202Controller {
    @Autowired
    ItemRepository repository;

    @RequestMapping("/lesson02_02/index")
    public String showItemList(Model model){
        model.addAttribute("itemList", repository.findAllByOrderByPriceAsc());
        return "/lesson0202/index";
    }
}
