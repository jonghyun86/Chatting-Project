package kr.ac.uc.webchatting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping("/")
    public String root() { return "redirect:/chat/main"; }

    @RequestMapping("/login")
    public String login() { return "security/login"; }

    @RequestMapping("/register")
    public String register() { return "security/register"; }

    @RequestMapping("/admin")
    public String admin() { return "redirect:/chat/main"; }
}
