package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/Recipe")
    public String Recipe ()
    {
        return "Recipe";//return the html file
    }
}
