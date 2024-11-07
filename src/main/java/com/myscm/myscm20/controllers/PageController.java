package com.myscm.myscm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name", "SubString technologies");
        model.addAttribute("Youtube", "youtube channel spring boot");
        System.out.println("home page handler");
        return "home";
    }

    @RequestMapping("/services")
    public String services(Model model){

        return "services";
    }

    @RequestMapping("about")
    public String about(Model model){

        return "about";
    }


}
