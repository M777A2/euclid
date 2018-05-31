package com.minusexpectations.euclid.web;

import com.minusexpectations.euclid.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String root()
    {
        return "index";
    }

    @GetMapping("/user")
    public String userIndex()
    {
        return "user/index";
    }

    @GetMapping("/login")
    public String login(Model model)
    {
        model.addAttribute("login", new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute LoginForm login)
    {
        return "user/index";
    }

    @GetMapping("/access-denied")
    public String accessDenied()
    {
        return "/error/access-denied";
    }

    @GetMapping("/error")
    public String errorPage()
    {
        return "/error/generic-error";
    }
}
