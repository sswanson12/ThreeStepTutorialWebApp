package edu.wctc.threesteptutorialwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHome() {
        return "index.html";
    }

    @RequestMapping("/supplies")
    public String showSuppliesPage(){
        return "pages/tutorialPage1";
    }

    @RequestMapping("/steps")
    public String showStepsPage(){
        return "pages/tutorialPage2";
    }

    @RequestMapping("/clean-up")
    public String showCleanUpPage(){
        return "pages/tutorialPage3";
    }
}
