package cc.sharper.jinjin.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @RequestMapping("/login")
    public Object login(){

        return  null;
    }

    @RequestMapping("logout")
    public Object logout(){

        return null;
    }

}
