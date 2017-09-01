package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private final String vm_path = "/";

    @RequestMapping("index.htm")
    public String index(Model model) throws Exception {
        model.addAttribute("tt","吉大师考虑就是发的块雷锋精神克难奋进");
        return vm_path + "front/index.vm";
    }

}
