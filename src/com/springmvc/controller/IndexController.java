package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

    private final String vm_path = "/";

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("service", "index");
        return vm_path + "front/index.vm";
    }

    @RequestMapping("{service}.htm")
    public String vacation(Model model, HttpServletRequest request, HttpServletResponse response,
                           @PathVariable String service) {
        model.addAttribute("service", service);
        return vm_path + "front/"+service+".vm";
    }

}
