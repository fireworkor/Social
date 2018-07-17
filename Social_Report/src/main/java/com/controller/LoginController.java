package com.controller;

import com.Repository.UserRepository;
import com.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 作者  :      fireworkor  3159553637@qq.com
 * 日期  :        2018/05/05  10:44  星期六
 * 描述  :
 */
@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String tologin() {
        return "login";
    }

    @PostMapping("/login")
    public String Index(@RequestParam String name, @RequestParam String password) {
        User u    = new User(null,name, password);
        User user = userRepository.findById(1L).get();
        if (user.getName().equals(u.getName())&&user.getPassword().equals(u.getPassword())) {
            return "weibo_food3";
        }
        return "error";
    }
    @GetMapping("/toindex")
    public String toIndex() {
            return "weibo_food3";
    }


}
