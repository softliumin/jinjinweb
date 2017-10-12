package cc.sharper.jinjin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "dashboard/index";
    }

    @RequestMapping("/adduser")
    public String addUser(){
        return "dashboard/adduser";
    }


}
